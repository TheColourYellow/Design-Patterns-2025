import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramController {
    List<Recommendation> recommendations;
    List<Book> books;
    Book book;

    public ProgramController(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    Scanner sc = new Scanner(System.in);
    int choice;

    public void modifyBookSelection(Recommendation recommendation, Book book) {
        System.out.println("Would you like to 1. Add or 2. Remove book?");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                Book clone = book.clone();
                System.out.println("1. Revise book details");
                System.out.println("2. Add cloned book as it is");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current book details:");
                        System.out.println(clone.toString());
                        modifyBook(clone);
                        recommendation.addBook(clone);
                        break;
                    case 2:
                        recommendation.addBook(clone);
                }
                break;
            case 2:
                try {
                recommendation.removeBook(book);
                } catch (Exception e) {
                    System.out.println("Could not find book.");
                }
                break;
        }
    }
    public void modifyBook(Book book) {
        System.out.println("Please set the new Author");
        String author = sc.next();
        book.setAuthor(author);
        System.out.println("Please set the new Title");
        String title = sc.next();
        book.setTitle(title);
        System.out.println("Please set the new Genre");
        String genre = sc.next();
        book.setGenre(genre);
        System.out.println("Please set the new Year");
        int year = sc.nextInt();
        book.setYear(year);
    }
    public Recommendation getRecommendations(List<Recommendation> recommendations) {
        for (int i = 0; i < recommendations.size()-1; i++) {
            System.out.println(i+1 + ": " + recommendations.get(i+1).getTargetAudience());
        }
        choice = sc.nextInt();
        return recommendations.get(choice);
    }
    public void modifyRecommendarion(Recommendation recommendation) {
        System.out.println("How would you like to modify the recommendation?");
        System.out.println("1. Add or Remove books");
        System.out.println("2. Clone Recommendation");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Here are the avaulable books");
                books = recommendation.getTangibleBooks();
                if (!books.isEmpty()) {
                recommendation.getBooks();
                choice = sc.nextInt();
                book = books.get(choice-1);
                }
                else book = new Book("Placeholder", "Placeholder", "Placeholder", 0);

                modifyBookSelection(recommendation, book);
                break;
            case 2:
                cloneRecommendation(recommendation);
                break;
        }
    }
    public void cloneRecommendation(Recommendation recommendation) {
        Recommendation clone = recommendation.clone();
        System.out.println("Would you like to rename the target audience? Y / N");
        choice = sc.next().charAt(0);
        switch (choice) {
            case 'Y':
                System.out.println("Please rename the new target audience");
                String audience = sc.next();
                clone.setTargetAudience(audience);
                recommendations.add(clone);
                break;
            case 'N':
                clone.setTargetAudience(clone.getTargetAudience() + "-clone");
                recommendations.add(clone);
                break;
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Recommendation currentRecommendation = null;
        boolean loop = true;

        Book fantasyBook = new Book("Author", "Fantasy Book", "Fantasy", 2000);
        Book tableTopBook = new Book("Author", "Table Top Book", "Manual", 2000);

        Book scienceBook = new Book("Author", "Science Book", "Science", 2000);
        Book scifiBook = new Book("Author", "Scifi Book", "Scifi", 2000);

        Recommendation defaultRecommendation = new Recommendation("Default");
        Recommendation science = new Recommendation("Science");
        Recommendation fantasy = new Recommendation("Fantasy");

        List<Recommendation> recommendations = new ArrayList<Recommendation>();
        recommendations.add(defaultRecommendation);
        recommendations.add(science);
        recommendations.add(fantasy);

        ProgramController controller = new ProgramController(recommendations);


        fantasy.addBook(fantasyBook);
        fantasy.addBook(tableTopBook);

        science.addBook(scienceBook);
        science.addBook(scifiBook);

        while (loop) {
            currentRecommendation = defaultRecommendation;

            System.out.println("-------------------------------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. View existing recommendations");
            System.out.println("2. Clone and modify existing recommendations");
            System.out.println("3. Create new recommendation");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    currentRecommendation = controller.getRecommendations(recommendations);
                    currentRecommendation.getBooks();
                    break;
                case 2:
                    currentRecommendation = controller.getRecommendations(recommendations);
                    controller.modifyRecommendarion(currentRecommendation);
                    break;
                case 3:
                    controller.cloneRecommendation(currentRecommendation);
                    break;
                case 4:
                    loop = false;
            }
            System.out.println("=================================================");
        }
    }
}

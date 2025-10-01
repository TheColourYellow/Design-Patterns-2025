import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        books = new ArrayList<Book>();
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clone = (Recommendation) super.clone();
            clone.books = new ArrayList<Book>();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            for (Book book : books) {
                clone.books.add(book.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public String getTargetAudience() {return targetAudience;}
    public void setTargetAudience(String targetAudience) {this.targetAudience = targetAudience;}
    public void getBooks() {
        if (!books.isEmpty()) {
            for (int i = 0; i < books.size(); i++) {
            System.out.println(i+1 +": "+books.get(i).toString());
            };
        } else {
            System.out.println("No books found");
        }
    }
    public List<Book> getTangibleBooks() {
        return books;
    }
    public void addBook(Book book) {books.add(book);}
    public void removeBook(Book book) {books.remove(book);}
}

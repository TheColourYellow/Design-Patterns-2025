public class Book implements Cloneable {

    private String author;
    private String title;
    private String genre;
    private int year;

    public Book(String author, String title, String genre, int year) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getAuthor() {return author;}
    public String getTitle() {return title;}
    public String getGenre() {return genre;}
    public int getYear() {return year;}

    public void setAuthor(String author) {this.author = author;}
    public void setTitle(String title) {this.title = title;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setYear(int year) {this.year = year;}

    @Override
    public Book clone() {
        try {
            Book clone = (Book) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", genre=" + genre + ", year=" + year + "]";
    }
}

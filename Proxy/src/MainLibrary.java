public class MainLibrary {
    public static void main(String[] args) throws AccessException {
        Library library = new Library();

        library.documentFactory("World File","Hello World", false);
        library.documentFactory("Secret File","Hello World in secret", true);

        library.getDocuments();
    }
}

import java.io.File;

public class Main {
    public static void main(String[] args) throws AccessException {
        Library library = new Library();

        Document file1 = new Document("Hello World!", false);
        /*DocumentProxy file1Proxy = new DocumentProxy(
                file1.documentId,
                file1.documentDate,
                "file1.txt",
                false);*/
        DocumentProxy file1Proxy = new DocumentProxy(file1);

        Document file2 = new Document("Hello World in secret!", true);
        /*DocumentProxy file2Proxy = new DocumentProxy(
                file2.documentId,
                file2.documentDate,
                "file2.txt",
                true);*/
        DocumentProxy file2Proxy = new DocumentProxy(file2);

        User user = new User("Normal User");
        User admin = new User("Admin User");
        admin.setAdmin();


        System.out.println(file1.documentId);
        System.out.println(file1Proxy.documentId);
        System.out.println(file1Proxy.getContent(file1.documentId, user));
        //System.out.println(file2Proxy.getContent(file2.documentId, user));
        System.out.println(file2Proxy.getContent(file2.documentId, admin));

    }
}

import java.util.HashMap;

public class Library {

    HashMap <String, TextFile> library;

    public Library() {
        library = new HashMap<>();
    }

    public void documentFactory(String name, String content, boolean secret) {
        Document file = new Document(content, secret);
        library.put(name, file);
        DocumentProxy fileProxy = new DocumentProxy(file);
        String proxyName = name + "-Proxy";
        library.put(proxyName, fileProxy);
    }

    public void getDocuments() {
        for (String name : library.keySet()) {
            System.out.println(name);
        }
    }

}

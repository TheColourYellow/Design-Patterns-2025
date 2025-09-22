import java.time.LocalDate;

public class Document implements TextFile{

    public int documentId;
    public LocalDate documentDate;
    private String content;

    private boolean secret;
    private static int counter = 0;

    public Document(String content, boolean secret) {
        counter++;
        this.documentId = counter;
        this.documentDate = LocalDate.now();
        this.content = content;
        this.secret = secret;
    }

    @Override
    public String getContent(Integer id, User user) {
        return content;
    }

    @Override
    public LocalDate getCreatioDate() {
        return documentDate;
    }
    public boolean isSecret() {
        return secret;
    }
}

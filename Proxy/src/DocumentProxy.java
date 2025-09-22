import java.time.LocalDate;

public class DocumentProxy implements TextFile{


    public int documentId;
    public LocalDate documentDate;
    private String content;

    private boolean secret;

    private Document realDocument;
    private AccessControlService acs = AccessControlService.getInstance();

    /*
    public DocumentProxy(int documentId, LocalDate documentDate, String content, boolean secret, Document realDocument) {
        this.documentId = documentId;
        this.documentDate = documentDate;
        this.content = content;
        this.secret = secret;
        this.realDocument = realDocument;
    }*/
    public DocumentProxy(Document realDocument) {
        this.realDocument = realDocument;
    }

    @Override
    public String getContent(Integer id, User user) throws AccessException {
        if (realDocument.isSecret()) {
            acs.isAllowed(documentId, user);
            return realDocument.getContent(documentId, user);
        }
        else {
            return realDocument.getContent(documentId, user);
        }
    }

    @Override
    public LocalDate getCreatioDate() {
        return realDocument.documentDate;
    }
}

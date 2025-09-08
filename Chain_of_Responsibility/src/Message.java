public class Message {
    private String content;
    private String email;
    enum Type {
        COMPLAINT,
        FEEDBACK,
        COMPENSATION,
        CONTACT,
        DEVELOPMENT
    }
    private Type messageType;

    public Message(String content, String email, Type type) {
        this.content = content;
        this.email = email;
        this.messageType = type;
    }

    public Type getMessageType() {
        return messageType;
    }
}

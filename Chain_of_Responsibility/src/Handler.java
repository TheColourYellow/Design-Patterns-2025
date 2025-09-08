public abstract class Handler {

    private Handler nextHandler;

    public void process(Message msg) {
        if (nextHandler != null) {
            nextHandler.process(msg);
        }

    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

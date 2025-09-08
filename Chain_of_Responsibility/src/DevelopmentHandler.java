public class DevelopmentHandler extends Handler {

    @Override
    public void process(Message msg) {
        if (msg.getMessageType() == Message.Type.DEVELOPMENT) {
            System.out.println("Development Feedback Handler");
        }
        else {
            System.out.println("Can't respond to feedback");
            super.process(msg);
        }
    }
}

public class FeedbackHandler  extends Handler {


    @Override
    public void process(Message msg) {
        if (msg.getMessageType() == Message.Type.FEEDBACK) {
        System.out.println("Feedback Feedback Handler");
        }
        else {
            System.out.println("Can't respond to feedback");
            super.process(msg);
        }

    }
}

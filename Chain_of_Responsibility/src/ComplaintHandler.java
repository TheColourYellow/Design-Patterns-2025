public class ComplaintHandler  extends Handler {

    @Override
    public void process(Message msg) {
        if (msg.getMessageType() == Message.Type.COMPLAINT) {
            System.out.println("Complaint Feedback Handler");
        }
        else {
            System.out.println("Can't respond to feedback");
            super.process(msg);
        }
    }
}

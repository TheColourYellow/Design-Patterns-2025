public class ContactHandler  extends Handler {

    @Override
    public void process(Message msg) {
        if (msg.getMessageType() == Message.Type.CONTACT) {
            System.out.println("Contact Feedback Handler");
        }
        else {
            System.out.println("Can't respond to feedback");
            super.process(msg);
        }
    }
}

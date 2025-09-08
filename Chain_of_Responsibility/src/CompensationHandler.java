public class CompensationHandler  extends Handler {

    @Override
    public void process(Message msg) {
        if (msg.getMessageType() == Message.Type.COMPENSATION) {
            System.out.println("Compensation Feedback Handler");
        }
        else {
            System.out.println("Can't respond to feedback");
            super.process(msg);
        }
    }

}

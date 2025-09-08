public class Main {
    public static void main(String[] args) {
        Handler feedbackHandler = new FeedbackHandler();
        Handler devHandler = new DevelopmentHandler();
        Handler contactHandler = new ContactHandler();
        Handler complaintHandler = new ComplaintHandler();
        Handler compensationHandler = new CompensationHandler();

        feedbackHandler.setNextHandler(complaintHandler);
        complaintHandler.setNextHandler(compensationHandler);
        compensationHandler.setNextHandler(devHandler);
        devHandler.setNextHandler(contactHandler);

        Message msg = new Message("Sucks", "email@email.com", Message.Type.COMPENSATION);

        feedbackHandler.process(msg);
    }
}

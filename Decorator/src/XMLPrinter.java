public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String print) {
        super.print("<message> " + print + " <message>");
    }
}

public class Client {

    public static void main(String[] args) {

        Printer printer = new ConsolePrinter();
        printer = new UpperCasePrintDecorator(new ReversePrintDecorator(printer));
        printer.print("abcd");

    }

}

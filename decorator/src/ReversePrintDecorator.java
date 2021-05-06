public class ReversePrintDecorator extends PrintDecorator {

    public ReversePrintDecorator(Printer wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String line) {
        line = new StringBuilder(line).reverse().toString();
        super.print(line);
    }
}

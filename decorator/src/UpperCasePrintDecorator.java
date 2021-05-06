public class UpperCasePrintDecorator extends PrintDecorator {

    public UpperCasePrintDecorator(Printer wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String line) {
        line = line.toUpperCase();
        super.print(line);
    }
}

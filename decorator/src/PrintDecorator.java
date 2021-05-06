public abstract class PrintDecorator implements Printer {

    private Printer wrappee;

    public PrintDecorator(Printer wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print(String line) {
        this.wrappee.print(line);
    }
}

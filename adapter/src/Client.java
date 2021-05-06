public class Client {

    public static void main(String[] args) {
        CSVPrinter csvPrinter = new CSVToStringListPrinterAdapter(new StringListPrinter());
        csvPrinter.printEntries("test;123;abc");
    }

}

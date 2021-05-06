import java.util.Arrays;
import java.util.List;

public class CSVToStringListPrinterAdapter implements CSVPrinter {

    private StringListPrinter adaptee;

    public CSVToStringListPrinterAdapter(StringListPrinter adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void printEntries(String csv) {
        List<String> list = convert(csv);
        this.adaptee.printEntries(list);
    }

    private List<String> convert(String csv) {
        return Arrays.asList(csv.split(";"));
    }
}

class OldPrinter {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }
}

interface Printable {
    void printDocument(String text);
}

class PrinterAdapter implements Printable {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument(String text) {
        oldPrinter.print(text);
    }
}


public class Adaptor {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printable adapter = new PrinterAdapter(oldPrinter);

        adapter.printDocument("Hello, Adapter Pattern!");

    }
}
package singleton;

public class Printer {

    //1st step
    private static Printer printer;

    //2nd step.
    //private konstruktorius, kad is isores negaletu pasiekti
    private Printer() {
        System.out.println("Creating a singleton PRINTER instance object.");
    }

    //3rd step. PUBLIC method to povide PUBLIC access.
    public static Printer getPrinterObject () {
        //kvieciant pirma karta, jis sukurs printerio objekta
        //kvieciant antra karta, jis grazins jau esama printeri.
        if (printer == null) {
            printer = new Printer(); //sukuriam objekta, jei dar neegzistuoja
        }
        return printer;
    }
}

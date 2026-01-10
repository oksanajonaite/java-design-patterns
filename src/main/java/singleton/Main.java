package singleton;

import observer_news_agency.Bobute;

public class Main {

    public static void main(String[] args) {

        Bobute ana = new Bobute();
        Bobute zose = new Bobute();

        Printer ofisoPrinteris = Printer.getPrinterObject();
        //kitas kintamasis, bet tas pats objektas
        Printer manoPrinteris = Printer.getPrinterObject();

    }
}

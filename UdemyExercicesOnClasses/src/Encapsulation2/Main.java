package Encapsulation2;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer( 100 , 0 , true );
//        printer.getTonerLevel();
//        printer.fillUpToner(70);
//        printer.printPages(10 , false);
//        printer.getTonerLevel();
//        printer.printPages(50 , true);
//        printer.getTonerLevel();
//        printer.printPages(100 , true);

        printer.printPages(50 , false);
        printer.printPages(50 , true);
        printer.printPages(50 , false);

    }
}

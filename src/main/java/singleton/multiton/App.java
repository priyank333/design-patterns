package singleton.multiton;

public class App {
    public static void main(String[] args) {
        Printer mainPrinter = Printer.getInstance(Subsystem.PRIMARY);
        Printer auxiliaryPrinter = Printer.getInstance(Subsystem.AUXILIARY);
        Printer auxiliaryPrinter1 = Printer.getInstance(Subsystem.AUXILIARY);
    }
}

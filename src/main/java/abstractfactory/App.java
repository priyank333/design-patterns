package abstractfactory;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        hotDrinkMachine.makeDrink();
    }
}

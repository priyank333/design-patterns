package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        tea.consume();

        // interactive
        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }
}

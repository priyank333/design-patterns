package abstractfactory;

public class AbstractFactoryDemo {
    /**
     * The abstract factory pattern is similar to the factory pattern and is a factory of factories.
     * If you are familiar with the factory design pattern in Java, you will notice that we have a single factory class
     * that returns the different subclasses based on the input provided and the factory class uses if-else or switch
     * statements to achieve this. In the abstract factory pattern, we get rid of if-else block and have a factory
     * class for each subclass and then an abstract factory class that will return the subclass based on the input
     * factory class.
     **/
    public static void main(String[] args) {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        tea.consume();

        // interactive
        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }
}

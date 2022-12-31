package creational.abstractfactory;

public class Coffee implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("Consuming hot coffee ...");
    }
}

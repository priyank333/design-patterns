package creational.abstractfactory;

public class Tea implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("Consuming hot tea ...");
    }
}

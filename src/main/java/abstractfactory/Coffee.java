package abstractfactory;

public class Coffee implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("Consuming Hot Coffee ...");
    }

}

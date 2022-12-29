package abstractfactory;

public class Tea implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("Consuming Hot Cofee ...");
    }

}

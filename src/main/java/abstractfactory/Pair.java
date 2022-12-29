package abstractfactory;

public class Pair {
    public String name;
    public IHotDrinkFactory iHotDrinkFactory;

    public Pair(String name, IHotDrinkFactory iHotDrinkFactory) {
        this.name = name;
        this.iHotDrinkFactory = iHotDrinkFactory;
    }
}

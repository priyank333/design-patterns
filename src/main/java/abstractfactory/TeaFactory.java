package abstractfactory;

public class TeaFactory implements IHotDrinkFactory {

    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("Add tea bag, boil water, pour " + amount + " ml, add cream and sugar, enjoy!");
        return new Tea();
    }
}

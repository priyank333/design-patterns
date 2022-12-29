package prototype.cloneable;

public class App {
    public static void main(String[] args) {
        Person john = new Person(new String[]{"John"}, new Address("LA ROAD", "12345"));
        try {
            Person jeffery = (Person) john.clone();
            System.out.println("Is both object have same address : " + (john == jeffery));
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

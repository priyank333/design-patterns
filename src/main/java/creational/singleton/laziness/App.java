package creational.singleton.laziness;

/**
 * The singleton pattern restricts the instantiation of a Class and ensures that only one instance of the class exists
 * in the Java Virtual Machine. The implementation of the singleton pattern has always been a controversial topic among
 * developers.
 */
public class App {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
    }
}

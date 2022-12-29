package singleton.laziness;

public class App {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
    }
}

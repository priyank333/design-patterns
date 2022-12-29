package singleton.innerstaticsingleton;

public class App {
    public static void main(String[] args) {
        InnerStaticSingleton innerStaticSingleton = InnerStaticSingleton.getInstance();
        System.out.println(innerStaticSingleton);
    }
}

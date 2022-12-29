package singleton.innerstaticsingleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton(){
        System.out.println("Initializing the object");
    }
    //Here, No need to make thread safe. While loading, it will create objects.
    private static class InnerStaticClass {
        private static InnerStaticSingleton innerStaticSingleton = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return InnerStaticClass.innerStaticSingleton;
    }
}
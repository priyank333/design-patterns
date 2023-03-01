package creational.singleton.laziness;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {
        System.out.println("Initializing singleton object");
    }
//    public static SingletonClass getInstance() {
//        if (singletonClass == null) {
//            singletonClass = new SingletonClass();
//        }
//        return singletonClass;
//    }

    //Thread safe
//    public synchronized static SingletonClass getInstance() {
//        if (singletonClass == null) {
//            singletonClass = new SingletonClass();
//        }
//        return singletonClass;
//    }

    //double-checked locking
    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                singletonClass = new SingletonClass();
            }
        }
        return singletonClass;
    }

    @Override
    public String toString() {
        return "SingletonClass{}";
    }
}

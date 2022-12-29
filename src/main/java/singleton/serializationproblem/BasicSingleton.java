package singleton.serializationproblem;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private BasicSingleton() {}
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value;

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    /*
    * Uncomment to resolve the issue.
    * While serializing this method return the object. It will not create new object.
    * */
//    protected Object readResolve() {
//        return INSTANCE;
//    }
}

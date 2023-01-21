package creational.singleton.serializationproblem;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private BasicSingleton() {
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value;

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /*
     * Uncomment to resolve the issue.
     * While serializing this method return the object. It will not create new object.
     *
     * The readResolve method is called when ObjectInputStream has read an object from the stream and is preparing to
     * return it to the caller. ObjectInputStream checks whether the class of the object defines the readResolve method.
     * If the method is defined, the readResolve method is called to allow the object in the stream to designate the
     * object to be returned. The object returned should be of a type that is compatible with all uses.
     * If it is not compatible, a ClassCastException will be thrown when the type mismatch is discovered.
     * */
//    protected Object readResolve() {
//        return INSTANCE;
//    }
}

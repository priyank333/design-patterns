package singleton.serializationproblem;

/**
 * The singleton pattern restricts the instantiation of a Class and ensures that only one instance of the class exists
 * in the Java Virtual Machine. The implementation of the singleton pattern has always been a controversial topic among
 * developers.
 */
public class App {
    public static void main(String[] args) {
        BasicSingleton singleInstance = BasicSingleton.getInstance();
        singleInstance.setValue(1);
        FileUtility.saveInFile(singleInstance, "basicSingleton.bin");
        singleInstance.setValue(2);
        BasicSingleton instanceFromFile = FileUtility.readFromFile("basicSingleton.bin");
        System.out.println(instanceFromFile == singleInstance);
        System.out.println(instanceFromFile.getValue());
    }
}

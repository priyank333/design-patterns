package singleton.serializationproblem;

public class App {
    public static void main(String[] args) {
        BasicSingleton singleInstance = BasicSingleton.getInstance();
        singleInstance.setValue(1);
        FileUtility.saveInFile(singleInstance, "basicSingleton.bin");
        singleInstance.setValue(2);
        BasicSingleton instanceFromFile = FileUtility.readFromFile("basicSingleton.bin");
        System.out.println( instanceFromFile== singleInstance);
        System.out.println(instanceFromFile.getValue());
    }
}

package singleton.enumsingleton;

import singleton.serializationproblem.FileUtility;

public class App {
    public static void main(String[] args) {

        /*
        * First save the object in the storage. Comment line# 13 to 15 and if we read value from stored object
        * we will get different value.
        * */
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        String fileName = "enumObject.bin";
        System.out.println("Current value : " + enumSingleton.getValue());
        enumSingleton.setValue(20);
        FileUtility.saveInFile(enumSingleton,fileName);
        EnumSingleton readFromFileObj = FileUtility.readFromFile(fileName);
        System.out.println("Value reading from file (after saving) : " + readFromFileObj.getValue());
    }
}

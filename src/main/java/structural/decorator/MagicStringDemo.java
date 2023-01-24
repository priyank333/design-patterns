package structural.decorator;

/**
 * Decorator design pattern is used to modify the functionality of an object at runtime.
 * At the same time other instances of the same class will not be affected by this,
 * so individual object gets the modified behavior. Decorator design pattern is one of the structural
 * design pattern (such as Adapter Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes
 * or interface with composition to implement.
 * <p>
 * Decorator Design Pattern - Important Points
 * 1. Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible.
 * Its easy to maintain and extend when the number of choices are more.
 * 2. The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
 * 3. Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 */
public class MagicStringDemo {
    public static void main(String[] args) {
        MagicString magicString = new MagicString("Hello");
        System.out.println(magicString.countVowels());
    }
}

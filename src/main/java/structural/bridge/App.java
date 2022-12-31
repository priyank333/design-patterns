package structural.bridge;

/**
 * When we have interface hierarchies in both interfaces and implementations, then bridge design pattern is used to
 * decouple the interfaces from implementation and hiding the implementation details from the client programs.
 * <p>
 * Just like Adapter pattern, bridge design pattern is one of the Structural design pattern.
 * According to GoF bridge design pattern is: Decouple an abstraction from its implementation so that the two can vary
 * independently.
 * </p>
 * The implementation of bridge design pattern follows the notion to prefer Composition to inheritance.
 */

public class App {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color greenColor = new GreenColor();
        Shape redSquareShape = new Square(redColor);
        Shape redTriangleShape = new Triangle(redColor);
        Shape greenTriangleShape = new Triangle(greenColor);
        redSquareShape.applyColor();
        redTriangleShape.applyColor();
        greenTriangleShape.applyColor();
    }
}

package creational.builder.factory;

public class App {
    /**
     * The factory design pattern is used when we have a superclass with multiple subclasses and based on input,
     * we need to return one of the subclasses. This pattern takes out the responsibility of the instantiation of a
     * Class from the client program to the factory class. We can apply a singleton pattern on the factory class or
     * make the factory method static.
     */
    public static void main(String[] args) {
        Point point = Point.PointFactory.newPolarPoint(1.3, 3.1);
        System.out.println("X : " + point.getX() + "; Y : " + point.getY());
    }
}

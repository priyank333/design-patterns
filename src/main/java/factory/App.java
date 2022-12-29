package factory;

public class App {
    public static void main(String[] args) {
        Point point = Point.PointFactory.newPolarPoint(1.3, 3.1);
        System.out.println("X : " + point.getX() + "; Y : " + point.getY());
    }
}

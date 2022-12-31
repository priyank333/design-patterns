package creational.factory;

public class Point {
    private Double x, y;

    private Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public static class PointFactory {
        public static Point newCartesianPoint(Double x, Double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(Double rho, Double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}

package structural.decorator.dynamic;

public class ColorShape implements Shape {

    private String color;
    private Shape shape;

    public ColorShape() {
    }

    public ColorShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has " + color + " color";
    }
}

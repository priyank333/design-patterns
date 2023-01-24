package structural.decorator.dynamic;

public class TransparentShape implements Shape {

    private Shape shape;
    private float transparency;

    public TransparentShape() {
    }

    public TransparentShape(Shape shape, float transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency";
    }
}

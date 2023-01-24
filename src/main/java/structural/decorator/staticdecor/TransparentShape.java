package structural.decorator.staticdecor;

import structural.decorator.dynamic.Shape;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

    private Shape shape;
    private float transparency;

    public TransparentShape(Supplier<? extends T> ctor, float transparency) {
        this.shape = ctor.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency";
    }
}

package structural.decorator.staticdecor;

import structural.decorator.dynamic.Shape;

import java.util.function.Supplier;

public class ColorShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public ColorShape(Supplier<? extends T> ctor, String color) {
        this.shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has " + color + " color";
    }
}

package structural.decorator.dynamic;

public class Circle implements Shape {

    private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void resize(int factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
}

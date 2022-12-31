package structural.bridge;

public abstract class Shape {

    //Composition - implementor
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}

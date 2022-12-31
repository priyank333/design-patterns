package creational.prototype.serialization;

import java.io.Serializable;

public class Circle implements Shape, Serializable {
    @Override
    public void draw() {
        System.out.println("Drawing circle ...");
    }
}

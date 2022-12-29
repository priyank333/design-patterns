package prototype.serialization;

import java.io.Serializable;

public class Rectangle implements Shape, Serializable {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle ...");
    }
}

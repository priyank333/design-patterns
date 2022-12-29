package prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

public class App {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Shape shape1 = SerializationUtils.roundtrip(shape);
        System.out.println("Is both object has same address : " + (shape == shape1));
    }
}

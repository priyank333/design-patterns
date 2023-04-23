package structural.decorator.carexample;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car is assembling ...");
    }
}

package structural.decorator.carexample;

public class CarDecorator implements Car {
    public Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

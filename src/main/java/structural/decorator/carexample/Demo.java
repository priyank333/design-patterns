package structural.decorator.carexample;

public class Demo {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        Car luxuryAndSportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxuryAndSportsCar.assemble();
    }
}

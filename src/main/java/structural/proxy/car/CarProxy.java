package structural.proxy.car;

public class CarProxy extends Car {
	public CarProxy(Driver driver) {
		super(driver);
	}

	@Override
	public void drive() {
		if (driver.age < 18) {
			System.out.println("Driver is too young.");
		} else {
			System.out.println("Driver is driving the car.");
		}
	}
	
}

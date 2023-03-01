package structural.proxy.car;

public class Car implements Drivable{

	protected Driver driver;
	
	public Car(Driver driver) {
		this.driver = driver;
	}
	
	@Override
	public void drive() {
		
	}
}

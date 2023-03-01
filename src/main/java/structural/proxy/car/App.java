package structural.proxy.car;

public class App {
	public static void main(String[] args) {
		
		/**
		 * By implementing the CarProxy, we don't need to change the existing code for validation of driver age.
		 * */
		Car car = new CarProxy(new Driver(19));
		car.drive();
	}
}

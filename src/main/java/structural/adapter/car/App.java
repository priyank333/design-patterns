package structural.adapter.car;

public class App {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BuggattiVeyron();
		MovableAdapter movableAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println("Speed in KMPH : " + bugattiVeyron.getSpeed());
		System.out.println("Speed in MPH: " + movableAdapter.getSpeed());
	}
}
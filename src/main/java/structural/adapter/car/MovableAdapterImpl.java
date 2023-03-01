package structural.adapter.car;

public class MovableAdapterImpl implements MovableAdapter{

	private Movable luxaryCars;
	
	public MovableAdapterImpl(Movable movable) {
		// TODO Auto-generated constructor stub
		this.luxaryCars = movable;
	}
	
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHToKM(luxaryCars.getSpeed());
	}
	
	private double convertMPHToKM(double mph) {
		return mph * 1.60934;
	}
}

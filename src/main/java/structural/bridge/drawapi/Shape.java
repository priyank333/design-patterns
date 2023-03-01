package structural.bridge.drawapi;

public abstract class Shape {
	public DrawApi drawApi;

	public Shape(DrawApi drawApi) {
		super();
		this.drawApi = drawApi;
	}
	
	public abstract void draw();
}

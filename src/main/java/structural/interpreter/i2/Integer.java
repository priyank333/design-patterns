package structural.interpreter.i2;

public class Integer implements Element {

	private java.lang.Integer intVal;

	public Integer(java.lang.Integer intVal) {
		this.intVal = intVal;
	}

	@Override
	public java.lang.Integer eval() {
		return intVal;
	}

}

package structural.interpreter.i1;

public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpreter(String con) {
		if (con.contains(data)) {
			return true;
		} else {
			return false;
		}
	}

}

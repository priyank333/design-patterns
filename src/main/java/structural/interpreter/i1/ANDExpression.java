package structural.interpreter.i1;

public class ANDExpression implements Expression {
	private Expression expression1;
	private Expression expression2;

	public ANDExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpreter(String data) {
		return expression1.interpreter(data) && expression2.interpreter(data);
	}
}

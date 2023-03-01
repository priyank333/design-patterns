package structural.interpreter;

public class BinaryOperation implements Element {
	public enum Type {
		ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, MOD;
	}

	public Type type;
	public Element left, right;

	@Override
	public int eval() {
		switch (type) {
		case ADDITION:
			return left.eval() + right.eval();
		case SUBTRACTION:
			return left.eval() - right.eval();
		case MULTIPLICATION:
			return left.eval() * right.eval();
		case DIVISION:
			return left.eval() / right.eval();
		case MOD:
			return left.eval() % right.eval();
		default:
			return 0;
		}
	}

	public void setType(Type type) {
		this.type = type;
	}

}

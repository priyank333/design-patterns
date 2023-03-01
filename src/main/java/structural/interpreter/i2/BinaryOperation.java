package structural.interpreter.i2;

public class BinaryOperation implements Element {

	private Element left;
	private Element right;
	private BinaryOperationType binaryOperationType;

	@Override
	public java.lang.Integer eval() {
		switch (binaryOperationType) {
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

	public Element getLeft() {
		return left;
	}

	public void setLeft(Element left) {
		this.left = left;
	}

	public Element getRight() {
		return right;
	}

	public void setRight(Element right) {
		this.right = right;
	}

	public BinaryOperationType getBinaryOperationType() {
		return binaryOperationType;
	}

	public void setBinaryOperationType(BinaryOperationType binaryOperationType) {
		this.binaryOperationType = binaryOperationType;
	}

}

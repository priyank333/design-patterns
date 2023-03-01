package structural.interpreter.i2;

public class Token {

	public TokenType tokenType;
	public String text;

	public Token(TokenType tokenType, String text) {
		super();
		this.tokenType = tokenType;
		this.text = text;
	}

	@Override
	public String toString() {
		return "`" + text + "`";
	}

}

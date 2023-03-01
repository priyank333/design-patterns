package structural.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static Element parse(List<Token> tokens) {
		BinaryOperation result = new BinaryOperation();
		boolean haveLHS = false;

		for (int i = 0; i < tokens.size(); i++) {
			Token token = tokens.get(i);

			switch (token.type) {
			case DIVISION:
				result.type = BinaryOperation.Type.DIVISION;
				break;
			case INTEGER:
				Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
				if (!haveLHS) {
					result.left = integer;
					haveLHS = true;
				} else {
					result.right = integer;
				}
				break;
			case LPAREN:
				int j = 0;
				for (; j < tokens.size(); j++) {
					if (tokens.get(j).type == Token.Type.RPAREN) {
						break;
					}
				}
				List<Token> subExpression = tokens.stream().skip(i + 1).limit(j - i - 1).collect(Collectors.toList());
				Element element = parse(subExpression);
				if (!haveLHS) {
					result.left = element;
					haveLHS = true;
				} else {
					result.right = element;
				}
				i = j;
				break;
			case SUBTRACTION:
				result.type = BinaryOperation.Type.SUBTRACTION;
				break;
			case MOD:
				result.type = BinaryOperation.Type.MOD;
				break;
			case MULTIPLICATION:
				result.type = BinaryOperation.Type.MULTIPLICATION;
				break;
			case ADDITION:
				result.type = BinaryOperation.Type.ADDITION;
				break;
			}
		}
		return result;
	}

	public static List<Token> lex(String input) {
		List<Token> result = new ArrayList<>();
		int index = 0;
		while (index < input.length()) {
			if (input.charAt(index) == '+') {
				result.add(new Token(Token.Type.ADDITION, "+"));
				index++;
			} else if (input.charAt(index) == '-') {
				result.add(new Token(Token.Type.SUBTRACTION, "-"));
				index++;
			} else if (input.charAt(index) == '*') {
				result.add(new Token(Token.Type.MULTIPLICATION, "*"));
				index++;
			} else if (input.charAt(index) == '/') {
				result.add(new Token(Token.Type.DIVISION, "/"));
				index++;
			} else if (input.charAt(index) == '%') {
				result.add(new Token(Token.Type.MOD, "%"));
				index++;
			} else if (input.charAt(index) == '(') {
				result.add(new Token(Token.Type.LPAREN, "("));
				index++;
			} else if (input.charAt(index) == ')') {
				result.add(new Token(Token.Type.RPAREN, ")"));
				index++;
			} else if (Character.isDigit(input.charAt(index))) {
				StringBuilder sb = new StringBuilder();
				while (index < input.length() && Character.isDigit(input.charAt(index))) {
					sb.append(input.charAt(index));
					index++;
				}
				result.add(new Token(Token.Type.INTEGER, sb.toString()));
			} else {
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Token> tokens = lex("(1 + 2) - (1 - 3)");
		//String output = tokens.stream().map(t -> t.toString()).collect(Collectors.joining("\t"));
		System.out.println(parse(tokens).eval());
	}
}

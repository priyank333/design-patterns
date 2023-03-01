package structural.interpreter.i2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static List<Token> lex(String input) {
        List<Token> result = new ArrayList<>();
        int index = 0;
        while (index < input.length()) {
            if (input.charAt(index) == '+') {
                result.add(new Token(TokenType.ADDITION, "+"));
                index++;
            } else if (input.charAt(index) == '-') {
                result.add(new Token(TokenType.SUBTRACTION, "-"));
                index++;
            } else if (input.charAt(index) == '*') {
                result.add(new Token(TokenType.MULTIPLICATION, "*"));
                index++;
            } else if (input.charAt(index) == '/') {
                result.add(new Token(TokenType.DIVISION, "/"));
                index++;
            } else if (input.charAt(index) == '%') {
                result.add(new Token(TokenType.MOD, "%"));
                index++;
            } else if (input.charAt(index) == '(') {
                result.add(new Token(TokenType.LPAREN, "("));
                index++;
            } else if (input.charAt(index) == ')') {
                result.add(new Token(TokenType.RPAREN, ")"));
                index++;
            } else if (Character.isDigit(input.charAt(index))) {
                StringBuilder sb = new StringBuilder();
                while (index < input.length() && Character.isDigit(input.charAt(index))) {
                    sb.append(input.charAt(index));
                    index++;
                }
                result.add(new Token(TokenType.INTEGER, sb.toString()));
            } else {
                index++;
            }
        }
        return result;
    }

    public static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;
        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);
            switch (token.tokenType) {
                case ADDITION:
                    result.setBinaryOperationType(BinaryOperationType.ADDITION);
                    break;
                case SUBTRACTION:
                    result.setBinaryOperationType(BinaryOperationType.SUBTRACTION);
                    break;
                case MULTIPLICATION:
                    result.setBinaryOperationType(BinaryOperationType.MULTIPLICATION);
                    break;
                case DIVISION:
                    result.setBinaryOperationType(BinaryOperationType.DIVISION);
                    break;
                case MOD:
                    result.setBinaryOperationType(BinaryOperationType.MOD);
                    break;
                case LPAREN:
                    int j = 0;
                    for (; j < tokens.size(); j++) {
                        if (tokens.get(j).tokenType == TokenType.RPAREN) {
                            break;
                        }
                    }
                    List<Token> subExpression = tokens.stream().skip(i + 1).limit(j - i - 1).collect(Collectors.toList());
                    Element element = parse(subExpression);
                    if (!haveLHS) {
                        result.setLeft(element);
                        haveLHS = true;
                    } else {
                        result.setRight(element);
                    }
                    i = j;
                    break;
                case INTEGER:
                    Element integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if (!haveLHS) {
                        result.setLeft(integer);
                        haveLHS = true;
                    } else {
                        result.setRight(integer);
                    }
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Token> tokens = lex("4+2");
        String parsedExpression = tokens.stream().map(t -> t.toString()).collect(Collectors.joining("\t"));
        System.out.println(parsedExpression);
        System.out.println(parse(tokens).eval());
    }
}

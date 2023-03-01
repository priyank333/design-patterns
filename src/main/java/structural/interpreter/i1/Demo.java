package structural.interpreter.i1;

public class Demo {
	public static void main(String[] args) {
		Expression person1 = new TerminalExpression("Priyank");
		Expression person2 = new TerminalExpression("Jai");
		
		Expression isSingle = new ORExpression(person1, person2);
		
		Expression vikram = new TerminalExpression("Vikram");
		Expression committed = new TerminalExpression("Committed");
		
		Expression isCommitted = new ANDExpression(vikram, committed);
		
		System.out.println(isSingle.interpreter("Priyank"));
		System.out.println(isSingle.interpreter("Jai"));
		System.out.println(isSingle.interpreter("Vikram"));
		
		System.out.println(isCommitted.interpreter("Committed, Vikram"));
		System.out.println(isCommitted.interpreter("Single, Vikram"));
		
	}
}

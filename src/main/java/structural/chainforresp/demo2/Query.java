package structural.chainforresp.demo2;

public class Query {
	public String creatureName;
	enum Argument {
		ATTACK, DEFENSE
	}
	public Argument argument;
	public int result;
	public Query(String creatureName, Argument argument, int result) {
		super();
		this.creatureName = creatureName;
		this.argument = argument;
		this.result = result;
	}
	
	
}

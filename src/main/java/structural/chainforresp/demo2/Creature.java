package structural.chainforresp.demo2;

import structural.chainforresp.demo2.Query.Argument;

public class Creature {
	private Game game;
	public String name;
	private int baseAttack, baseDefenese;
	public Creature(Game game, String name, int baseAttack, int baseDefenese) {
		super();
		this.game = game;
		this.name = name;
		this.baseAttack = baseAttack;
		this.baseDefenese = baseDefenese;
	}
	
	public int getAttack() {
		Query query = new Query(name, Argument.ATTACK, baseAttack);
		game.queries.fire(query);
		return query.result;
	}
	
	public int getDefense() {
		Query query = new Query(name, Argument.DEFENSE, baseDefenese);
		game.queries.fire(query);
		return query.result;
	}

	@Override
	public String toString() {
		return "Creature [game=" + game + ", name=" + name + ", attack=" + getAttack() + ", defense="
				+ getDefense() + "]";
	}
	
	
}

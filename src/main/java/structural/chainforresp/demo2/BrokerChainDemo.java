package structural.chainforresp.demo2;

public class BrokerChainDemo {
	public static void main(String[] args) throws Exception {
		Game game = new Game();
		Creature creature = new Creature(game, "Strong Goblin", 2, 2);
		System.out.println(creature);
		
		new IncreaseDefenseModifier(game, creature);
		try (DoubleAttackModifier doubleAttackModifier = new DoubleAttackModifier(game, creature)) {
			System.out.println(creature);
		}
		
		System.out.println(creature);
	}
}

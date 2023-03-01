package structural.chainforresp.demo2;

import structural.chainforresp.demo2.Query.Argument;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {

	
	private int token;
	public DoubleAttackModifier(Game game, Creature creature) {
		super(game, creature);
		token = game.queries.subscribe(q -> {
			if (q.creatureName.equals(creature.name) && q.argument == Argument.ATTACK) {
				q.result *= 2;
			}
		});
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing");
		game.queries.unsubscribe(token);
	}

}

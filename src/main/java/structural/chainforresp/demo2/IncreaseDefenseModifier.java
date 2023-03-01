package structural.chainforresp.demo2;

import structural.chainforresp.demo2.Query.Argument;

public class IncreaseDefenseModifier extends CreatureModifier{

	public IncreaseDefenseModifier(Game game, Creature creature) {
		super(game, creature);
		
		game.queries.subscribe(q -> {
			if (q.creatureName.equals(creature.name) && q.argument == Argument.DEFENSE) {
				q.result += 3;
			}
		});
	}

}

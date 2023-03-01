package structural.chainforresp.demo1;

public class CreatureModifier {
	protected Creature creature;
	protected CreatureModifier creatureModifierNext;
	public CreatureModifier(Creature creature) {
		super();
		this.creature = creature;
	}
	
	public void add(CreatureModifier creatureModifier) {
		if (this.creatureModifierNext != null) {
			creatureModifierNext.add(creatureModifier);
		} else {
			this.creatureModifierNext = creatureModifier;
		}
	}
	
	public void handle() {
		if (creatureModifierNext != null) creatureModifierNext.handle();
	}
}

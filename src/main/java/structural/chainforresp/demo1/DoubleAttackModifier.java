package structural.chainforresp.demo1;

public class DoubleAttackModifier extends CreatureModifier{

	public DoubleAttackModifier(Creature creature) {
		super(creature);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle() {
		System.out.println("Doubling " + creature.name + "'s attack.");
		this.creature.attack *= 2;
		super.handle();
	}
	
}

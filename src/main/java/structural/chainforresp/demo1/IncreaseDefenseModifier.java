package structural.chainforresp.demo1;

public class IncreaseDefenseModifier extends CreatureModifier{

	public IncreaseDefenseModifier(Creature creature) {
		super(creature);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle() {
		
		System.out.println("Increasing " + creature.name + "'s defense.");
		this.creature.defense += 3;
		super.handle();
	}

	
	
}

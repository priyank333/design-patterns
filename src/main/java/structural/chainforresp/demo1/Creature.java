package structural.chainforresp.demo1;

public class Creature {
	public String name;
	public int attack, defense;
	public Creature(String name, int attack, int defense) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
	}
	@Override
	public String toString() {
		return "Creature [name=" + name + ", attack=" + attack + ", defense=" + defense + "]";
	}
	
	
}

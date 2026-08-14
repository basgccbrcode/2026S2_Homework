package characters;

public class SafeCharacter {

	private int health, magic;
	private String name;
	private double strength;
	
	SafeCharacter(String name) {
		this.health = 100;
		this.magic = 10;
		this.strength = 3.0;
		this.name = name;
	}
	
	
void takeDamage (int dmg) {
	System.out.print("SafeCharacter health before %d\n", this.health);
}

}
package characters;

public class PlayerCharacter {
	int health = 0;
	int magic = 0;
	double strength = 0.0;
	String name = "";
	
	
	
	PlayerCharacter(String nameIn) {
		this.health = 100;
		this.magic = 10;
		this.strength = 3.0;
		this.name = nameIn;
	}
	
	void attack() {
		System.out.printf("%s attacks with strength: %.2f!\n", this.name, this.strength);
	}
	
	void takeDamage (int damage) {
		System.out.printf("\tCurrent health of %s : %d\n", this.name, this.health);
		this.health = this.health - damage;
		System.out.printf("\tUpdated health of %s : %d\n", this.name, this.health);
	}
	
	void heal(int healing) {
		System.out.printf("\tCurrent health of %s : %d\n", this.name, this.health);
		this.health = this.health + healing;
		System.out.printf("\tUpdated health of %s : %d\n", this.name, this.health);
	}
	
	public static void main(String[] args) {
		PlayerCharacter sean = new PlayerCharacter("Sean");
		sean.attack();
		sean.takeDamage(5);
		sean.takeDamage(5);
		sean.heal(10);

	}

}

package assignments;

public class DuelistCharacters implements Duelist {
	
	private String StudentName = "Bas";
	private String Weapon = "stick";
	
	private String RandomSeed = "0195659";
	private int Health = "10";
	private int Magic = "100";
	private int Strength = "5";
	
	private int BattleCry = "we must die";
	private int SpecialMove = "stick injure u";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getStudentName() {
		// TODO Auto-generated method stub
		return StudentName;
	}

	@Override
	public String getWeapon() {
		// TODO Auto-generated method stub
		return Weapon;
	}

	@Override
	public long getRandomSeed() {
		// TODO Auto-generated method stub
		return RandomSeed;
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return Health;
	}

	@Override
	public int getMagic() {
		// TODO Auto-generated method stub
		return Magic;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return Strength;
	}

	@Override
	public String getBattleCry() {
		// TODO Auto-generated method stub
		return BattleCry;
	}

	@Override
	public String getSpecialMove() {
		// TODO Auto-generated method stub
		return SpecialMove;
	}

}

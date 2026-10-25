package lesson17;

public class TrafficLight {
	
	enum Functions {
		RED, ORANGE, GREEN;
	
	public Functions next() {
		switch(this)  {
		case GREEN:
			return ORANGE;
		case ORANGE:
			return RED;
		case RED:
			return GREEN;
		}
		}
	}
	
	enum Planets {
		MERCURY,
		VENUS,
		EARTH,
		MARS,
		JUPITER,
		SATURN,
		URANUS,
		NEPTUNE
	}
	
	
	private String currentFunction = "Green";
	
	public String nextFunction () {
		if (this.currentFunction.equals("Green"))
			this.currentFunction = "Amber";
	} else if (this.currentFunction.equals("Amber")) {
		this.currentFunction = "Red";
	} else {
		this.currentFunction = "Green";
		}
		return this.currentFunction;
	}

	public static void main(String[] args) {
		Functions f = Functions.RED;
		System.out.println(f);
	}

}

}

package demol16;

public class RaceCar {

	static class Engine {
		void start () {
			System.out.println("The engine has started.");
		}
	}
	
	public void run() {
		RaceCar.Engine e = new Engine();
		e.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RaceCar rc = new RaceCar();
		rc.run();
	}

}

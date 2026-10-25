package demo;

public class State {

	interface LightState {
		void next(TrafficLight light);
	}
	
	// concrete
	static class Green implements LightState {
		@Override
		public void next(TrafficLight light) {
			System.out.println("Green -> Orange");
			light.setState(new Orange());
		}
	}
	
	static class Orange implements LightState {
		@Override
		public void next(TrafficLight light) {
			System.out.println("Orange -> Red");
			light.setState(new Red());
		}
	}
	
	static class Red implements LightState {
		@Override
		public void next(TrafficLight light) {
			System.out.println("Red -> Green");
			light.setState(new Green());
		}
	}
	
	static class TrafficLight {
		private LightState state = new Red();
		
		void next() {
			this.state.next(this);
		}

		public void setState(Red red) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	public static void main(String[] args) {
		TrafficLight trafficlight = new TrafficLight();
		
		trafficlight.next();
		trafficlight.next();
		trafficlight.next();
	}

}

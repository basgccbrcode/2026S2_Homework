package demo;

public class SingletonDemo {
	
	static final class Settings {
		private static final Settings INSTANCE = new Settings();
		
		private Settings () {}
		static Settings getInstance() {
			return INSTANCE;
		}
			
			String getCurrentTheme() {
				return "dark";
			}
		}

	public static void main(String[] args) {
		// calendar theme
		

	}

}

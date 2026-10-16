package demo;

public class SingletonFactory {
	private static class Configuration {
		private static final Configuration INSTANCE = new Configuration();
		
		private final String applicationName = "CC shop";
		
		private Configuration() {}
		
		static Configuration getInstance() {
			return INSTANCE;
		}
		
		String getApplicationName() {
			return applicationName;
		}
		
		private interface Logger {
			void log(String message);
		}
		
		private static class PlainLogger implements Logger {
			@Override
			public void log(String message) {
				System.out.println(message);
			}
			
			private static class LabelledLogger implements Logger {
				@Override
				public void log(String message) {
					System.out.println("Shop" + message);
				}
		}
			private static class LoggerFactory {
				static Logger create(String choice) {
					if (choice.equals("plain")) {
						return new PlainLogger();
					}
					else if (choice.equals("labelled")) {
						return new LabelledLogger();
					}
				}
			}
			
			
			public static void main(String[] args) {
				Configuration first = Configuration.getInstance();
				
			} 		
	}
}
}
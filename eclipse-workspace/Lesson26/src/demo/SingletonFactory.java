package demo;

public class SingletonFactory {
	private static class Configuration {
		private static final Configuration INSTANCE = new Configuration();
		
		private final String applicationName = "CC shop";
		private final boolean labelledLogs = true;
		
		private Configuration() {}
		
		static Configuration getInstance() {
			return INSTANCE;
		}
		
		String getApplicationName() {
			return applicationName;
		}
		
        boolean useLabels() {
            return labelledLogs;
        }
    }
		
		private interface Logger {
			void log(String message);
		}
		
		private static class PlainLogger implements Logger {
			@Override
			public void log(String message) {
				System.out.println(message);
			}
		}
			
			private static class LabelledLogger implements Logger {
				 private final String component;

			        LabelledLogger(String component) {
			            this.component = component;
			        }
				
				@Override
				public void log(String message) {
					System.out.println(component + message);
				}
		}
			
			private static class LoggerFactory {
				 static Logger create(String component, Configuration configuration) {
			            if (configuration.useLabels()) {
			                return new LabelledLogger(component);
			            }
			            return new PlainLogger();
			        }
			    }
			
			
			public static void main(String[] args) {
				Configuration first = Configuration.getInstance();
				Configuration second = Configuration.getInstance();
		        System.out.println("Shared instance: " + (first == second));

		        Logger logger = LoggerFactory.create("shops", second);
		        logger.log(second.getApplicationName() + " shops opened");
			} 		
}

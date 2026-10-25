package demo;

public class ProxyDemo {
	interface FileAccess {
		void read();
	}

	static class RealFile implements FileAccess {
		@Override
		public void read() {
			System.out.println("contents");
		}
		}
	
	static class FileProxy implements FileAccess {
		private RealFile file;
		private final String role;
		
		FileProxy(String role) {
			this.role = role;
		}
		
		@Override
		public void read() {
			if (!role.equals("admin")) {
				System.out.println("error! no access");
				return;
			}
			if (file == null) {
				file = new RealFile();
			}
			file.read();
		}
	}


	public static void main (String[] args) {
		new FileProxy("guest").read();
		new FileProxy("admin").read();
	}
	
	
	}

package demo;

public class AdapterPrint {

		interface Printable {
			void print(String text);
		}
		
		static class LegacyPrinter {
			void printOld(String text) {
				System.out.println("old: " + text);
			}
		}
	
		static class PrinterAdapter implements Printable {
			private final LegacyPrinter oldPrinter;
			
			PrinterAdapter(LegacyPrinter oldPrinter) {
				this.oldPrinter = oldPrinter;
			}
			
			@Override
			public void print(String text) {
				oldPrinter.printOld(text);
			}
		}		

public static void main(String[] args) {
	Printable printer = new PrinterAdapter(new LegacyPrinter());
	
	printer.print("Bas was Here. this suceeded");
}
}

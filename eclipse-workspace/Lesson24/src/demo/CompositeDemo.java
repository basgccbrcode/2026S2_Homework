package demo;

import java.util.ArrayList;

import java.util.List;

public class CompositeDemo {

	
	interface MenuPart {
		void show (String indent);
	}
	
	static class MenuItem implements MenuPart {
		private final String name;
		
		MenuItem(String name) {
			this.name = name;
		}
		
		@Override
		public void show(String indent) {
			System.out.println(indent + name);
		}
		
	}
	
	
	static class Menu implements MenuPart {
		private final String name;
		private final List<MenuPart> children = new ArrayList<>();
		
		Menu(String name) {
			this.name = name;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package demo;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	static class Editor {
		private String text = "";
		
		void setText(String text) {
			this.text = text;
		}
		
		String getText() {
			return text;
		}
		
		Snapshot save() {
			return new Snapshot(text);
		}
		
		void restore(Snapshot snapshot) {
			this.text = snapshot.text;
		}
		
		static class Snapshot {
			private final String text;
			
			private Snapshot(String text) {
				this.text = text;
			}
		}
	}
	
	
	static class History {
		private final List<Editor.Snapshot> snapshots = new ArrayList<>();
		
		void save(Editor editor) {
			snapshots.add(editor.save());
		}
		
		void undo(Editor editor) {
			int last = snapshots.size() -1;
			editor.restore(snapshots.remove(last));
		}
	}
	
	public static void main(String[] args) {
		Editor editor = new Editor();
		History history = new History();
		
		history.save(editor);
		editor.setText("Hello");
		history.save(editor);
		editor.setText("Hello, World");
		System.out.println("1: " + editor.getText());
		
		history.undo(editor);
		System.out.println("2: " + editor.getText());
		history.undo(editor);
		System.out.println(editor.getText());
	}

}
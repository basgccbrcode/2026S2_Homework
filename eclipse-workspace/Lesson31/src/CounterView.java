

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;




public class CounterView {
	private final Label countLabel = new Label ("clicks: 0");
	private final Button countButton = new Button ("click this");
	private final VBox layout = new VBox(12, countLabel, countButton);

	public CounterView() {
		layout.setPadding(new Insets(20));
	}
	
	public Parent getRoot() {
		return layout;
	}
	
	public Button getCountButton() {
		return countButton;
	}
	
	public void showCount(int clickCount) {
		countLabel.setText("Clicks:" + clickCount);
	}
	
}

package Lesson29Q3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavafxGrid extends Application {
	
	@Override
	 public void start(Stage stage) {
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(15));
		
		layout.add(new Label("name:"), 0,0);
		layout.add(new TextField(), 1, 0);
		
		layout.add(new Label("Email:"), 0,1);
		layout.add(new TextField(), 1, 1);
		
		layout.add(new Label("Pass:"), 0,2);
		layout.add(new PasswordField(), 1, 2);
		
		Button submitButton = new Button("enter");
		layout.add(submitButton, 1, 3);
		
        Scene scene = new Scene(layout, 240, 120);
        stage.setTitle("JavaFX form");
        stage.setScene(scene);
        stage.show();
    }

	public static void main(String[] args) {
		launch(args);
			// TODO JavaFX
	}

}

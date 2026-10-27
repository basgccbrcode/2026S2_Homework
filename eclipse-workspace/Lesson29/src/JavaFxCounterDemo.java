import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** Opens a small window with a button that counts clicks. */
public class JavaFxCounterDemo extends Application {
    private int clickCount;

    @Override
    public void start(Stage stage) {
        Label countLabel = new Label("Clicks multipiler: 0");
        Label countMultiplier = new Label("Clicks multiplier: 4");
        Button countButton = new Button("Click me");
        countButton.setOnAction(event -> {
            clickCount++;
            countLabel.setText("Clicks: " + clickCount);
            countMultiplier.setText("Clicks multiplier: " + clickCount*4);
        });

        VBox layout = new VBox(12, countLabel, countMultiplier, countButton);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 240, 120);
        stage.setTitle("JavaFX counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

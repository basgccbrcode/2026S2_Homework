package assesment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** A small JavaFX thermometer. */
public class LearningSupport extends Application {
    @Override
    public void start(Stage stage) {
        LearningGoal goal = new LearningGoal();
        EvidenceEntry view = new EvidenceEntry();
        new ThermometerController(goal, view);

        stage.setTitle("Learning Support App");
        stage.setScene(new Scene(view.root, 480, 510));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private enum TemperatureUnit {
        CELSIUS("°C"), FAHRENHEIT("°F"), KELVIN("K");

        private final String symbol;

        TemperatureUnit(String symbol) {
            this.symbol = symbol;
        }
    }

    /** Goals: stores goals and readings. */
    private static final class LearningGoal {
        private final List<Reading> readings = new ArrayList<>();
        private double celsius = 20.0;
        private TemperatureUnit unit = TemperatureUnit.CELSIUS;

        private void setCelsius(double celsius) {
            this.celsius = celsius;
        }

        private void setUnit(TemperatureUnit unit) {
            this.unit = unit;
        }

        private double displayedValue() {
            switch (unit) {
                case FAHRENHEIT:
                    return celsius * 9.0 / 5.0 + 32.0;
                case KELVIN:
                    return celsius + 273.15;
                default:
                    return celsius;
            }
        }

        private String displayedTemperature() {
            return String.format("%.1f %s", displayedValue(), unit.symbol);
        }

        private Reading record(LocalDate date, LocalTime time) {
            if (date == null) {
                throw new IllegalArgumentException("Choose a date before recording.");
            }

            Reading reading = new Reading(LocalDateTime.of(date, time), displayedValue(), unit);
            readings.add(reading);
            return reading;
        }
    }

    private static final class Reading {
        private static final DateTimeFormatter STAMP =
            DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");

        private final LocalDateTime recordedAt;
        private final double value;
        private final TemperatureUnit unit;

        private Reading(LocalDateTime recordedAt, double value, TemperatureUnit unit) {
            this.recordedAt = recordedAt;
            this.value = value;
            this.unit = unit;
        }

        @Override
        public String toString() {
            return String.format("%s  —  %.1f %s", recordedAt.format(STAMP), value, unit.symbol);
        }
    }

    private static final class EvidenceEntry {
        private final VBox root;
        private final Slider temperatureSlider = new Slider(-40, 100, 20);
        private final Label temperatureLabel = new Label();
        private final Button coolerButton = new Button("− 1 °C");
        private final Button warmerButton = new Button("+ 1 °C");
        private final ToggleGroup unitGroup = new ToggleGroup();
        private final DatePicker datePicker = new DatePicker(LocalDate.now());
        private final Button recordButton = new Button("Record reading");
        private final ListView<Reading> readingList = new ListView<>();
        private final Label statusLabel = new Label();

        private EvidenceEntry() {
            temperatureSlider.setShowTickLabels(true);
            temperatureSlider.setShowTickMarks(true);
            temperatureSlider.setMajorTickUnit(20);

            RadioButton celsiusButton = unitButton("Celsius", TemperatureUnit.CELSIUS);
            RadioButton fahrenheitButton = unitButton("Fahrenheit", TemperatureUnit.FAHRENHEIT);
            RadioButton kelvinButton = unitButton("Kelvin", TemperatureUnit.KELVIN);
            celsiusButton.setSelected(true);

            HBox adjustControls = new HBox(10, coolerButton, warmerButton);
            HBox unitControls = new HBox(12, celsiusButton, fahrenheitButton, kelvinButton);
            HBox recordControls = new HBox(10, datePicker, recordButton);

            root = new VBox(
                12,
                new Label("Find LSA's"),
                temperatureSlider,
                adjustControls,
                temperatureLabel,
                new Label("Type of work"),
                unitControls,
                new Label("Date for this reading"),
                recordControls,
                statusLabel,
                new Label("Recorded readings"),
                readingList
            );
            root.setPadding(new Insets(18));
            readingList.setPrefHeight(170);
            temperatureLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        }

        private RadioButton unitButton(String label, TemperatureUnit unit) {
            RadioButton button = new RadioButton(label);
            button.setToggleGroup(unitGroup);
            button.setUserData(unit);
            return button;
        }
    }

    private static final class ThermometerController {
        private final LearningGoal goal;
        private final EvidenceEntry view;

        private ThermometerController(LearningGoal goal, EvidenceEntry view) {
            this.goal = goal;
            this.view = view;

            view.temperatureSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    goal.setCelsius(newValue.doubleValue());
                    refreshDisplay();
                }
            );
            view.coolerButton.setOnAction(
                event -> view.temperatureSlider.setValue(view.temperatureSlider.getValue() - 1)
            );
            view.warmerButton.setOnAction(
                event -> view.temperatureSlider.setValue(view.temperatureSlider.getValue() + 1)
            );

            wireUnitButtons();
            wireRecordButton();
            refreshDisplay();
        }

        private void wireUnitButtons() {
            // TODO: Listen for a selected radio button and call changeUnit.
        }

        private void wireRecordButton() {
            // TODO: Connect Record reading to recordReading.
        }

        private void changeUnit(Toggle selectedToggle) {
            // TODO: Read the selected unit, update the model, then refresh the label.
        }

        private void recordReading() {
            // TODO: Combine the chosen date with the current time and record the value.
            // Add the returned Reading to the list and show a message if no date is chosen.
        }

        private void refreshDisplay() {
            view.temperatureLabel.setText(goal.displayedTemperature());
        }
    }
}

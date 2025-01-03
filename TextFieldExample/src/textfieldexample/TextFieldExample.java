import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldExample extends Application {

    private final String FONT_FAMILY = "monospace"; // Use a monospace font

    @Override
    public void start(Stage primaryStage) {
        // Create a text field
        TextField textField = new TextField();
        textField.setPromptText("Enter text here");

        // Set the font family to monospace
        textField.setStyle("-fx-font-family: " + FONT_FAMILY + ";");

        // Set the initial horizontal alignment and column size
        textField.setAlignment(Pos.CENTER);
        textField.setPrefColumnCount(10);

        // Create a VBox to hold the text field and radio buttons
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        // Create a radio button group for horizontal alignment
        ToggleGroup alignmentGroup = new ToggleGroup();

        // Create left, center, and right radio buttons for horizontal alignment
        RadioButton leftButton = new RadioButton("Left");
        leftButton.setToggleGroup(alignmentGroup);
        leftButton.setOnAction(e -> textField.setAlignment(Pos.CENTER_LEFT));

        RadioButton centerButton = new RadioButton("Center");
        centerButton.setToggleGroup(alignmentGroup);
        centerButton.setOnAction(e -> textField.setAlignment(Pos.CENTER));
        centerButton.setSelected(true); // Set the default alignment to center

        RadioButton rightButton = new RadioButton("Right");
        rightButton.setToggleGroup(alignmentGroup);
        rightButton.setOnAction(e -> textField.setAlignment(Pos.CENTER_RIGHT));

        // Create an HBox to hold the radio buttons
        HBox alignmentBox = new HBox(10);
        alignmentBox.setAlignment(Pos.CENTER);
        alignmentBox.getChildren().addAll(leftButton, centerButton, rightButton);

        // Create a text field for column size
        TextField columnSizeField = new TextField();
        columnSizeField.setPromptText("Enter column size");
        columnSizeField.setPrefColumnCount(5);
        columnSizeField.setOnAction(e -> {
            // Set the column size of the text field to the value entered in the column size text field
            int columnSize = Integer.parseInt(columnSizeField.getText());
            textField.setPrefColumnCount(columnSize);

            // Adjust the width of the text field based on the number of columns and the width of a single character
            double characterWidth = getCharacterWidth();
            double textFieldWidth = columnSize * characterWidth;
            textField.setPrefWidth(textFieldWidth);
        });

        // Create a VBox to hold the column size text field
        VBox sizeBox = new VBox(10);
        sizeBox.setAlignment(Pos.CENTER);
        sizeBox.getChildren().addAll(columnSizeField);

        // Add the text field, alignment radio buttons, and size text field to the VBox
        vbox.getChildren().addAll(textField, alignmentBox, sizeBox);

        // Wrap the VBox in a ScrollPane
        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        // Create a scene and add the ScrollPane to it
        Scene scene = new Scene(scrollPane, 300, 200);

        // Set the scene and show the stage
        primaryStage.setTitle("Text Field Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Get the pixel width of a single character in the font used
    private double getCharacterWidth() {
        TextField temp = new TextField("W");
        temp.setStyle("-fx-font-family: " + FONT_FAMILY);
        temp.applyCss();
        return temp.getLayoutBounds().getWidth();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * This is a JavaFX application template
 * It creates a GUI window with a heading, an image, a text box, and a button
 */
package javafxapplication1;

/**
 * Main class for the JavaFX Application
 * @author evanmusick
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Set the title of the primary stage
    primaryStage.setTitle("TITLE");

    // Create a heading text with custom font size and weight
    Text heading = new Text("THIS IS A HEADING");
    heading.setStyle("-fx-font-size: 24px; -fx-font-weight: bold");

    // Load an image from the internet
    Image image = new Image("https://static01.nyt.com/images/2022/04/04/multimedia/15ai-nocode/15ai-nocode-mobileMasterAt3x.jpg");
    // Create an ImageView to display the image
    ImageView imageView = new ImageView(image);
    // Set the width of the ImageView and preserve its aspect ratio
    imageView.setFitWidth(400);
    imageView.setPreserveRatio(true);

    // Create a non-editable text box with wrap text enabled
    TextArea textBox = new TextArea();
    textBox.setText("THIS IS A TEXT BOX! :D");
    textBox.setEditable(false);
    textBox.setWrapText(true);

    // Create a button
    Button requestInfoButton = new Button("I'M A BUTTON!");

    // Create a VBox to hold the elements
    VBox root = new VBox(10, heading, imageView, textBox, requestInfoButton);
    // Add padding to the VBox
    root.setPadding(new Insets(10));

    // Create a scene with the VBox as its root and set the scene on the primary stage
    Scene scene = new Scene(root, 450, 500);
    primaryStage.setScene(scene);
    // Show the primary stage
    primaryStage.show();
  }
}

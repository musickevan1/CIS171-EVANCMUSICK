import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

public class FinalHangman extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a canvas to draw the hangman on
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        // Draw the stand
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(10);
        gc.strokeLine(50, 350, 150, 350);
        gc.strokeLine(100, 350, 100, 50);
        gc.strokeLine(100, 50, 250, 50);
        gc.strokeLine(250, 50, 250, 100);
        
        // Draw the head
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        gc.fillOval(200, 100, 100, 100);
        gc.strokeOval(200, 100, 100, 100);
        
        // Draw the body
        gc.strokeLine(250, 200, 250, 300);
        
        // Draw the arms
        gc.strokeLine(250, 225, 200, 250);
        gc.strokeLine(250, 225, 300, 250);
        
        // Draw the legs
        gc.strokeLine(250, 300, 200, 350);
        gc.strokeLine(250, 300, 300, 350);
        
        // Set up the root node and scene
        VBox root = new VBox(canvas);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 400);
        
        // Set the stage properties and show the scene
        primaryStage.setTitle("Hangman Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

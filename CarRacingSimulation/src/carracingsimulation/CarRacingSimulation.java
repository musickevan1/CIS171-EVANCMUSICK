/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package carracingsimulation;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CarRacingSimulation extends Application {

    private static final int WIDTH = 800; // Width of the window
    private static final int HEIGHT = 600; // Height of the window
    private static final int CAR_WIDTH = 300; // Width of the car image
    private static final int CAR_HEIGHT = 150; // Height of the car image
    private static final int CAR_SPEED = 5; // Initial speed of the car
    private static final int CAR_MIN_SPEED = 1; // Minimum speed of the car
    private static final int CAR_MAX_SPEED = 10; // Maximum speed of the car
    
    private Image carImage; // Image of the car
    private ImageView carImageView; // ImageView of the car
    private int carX; // X coordinate of the car
    private int carY; // Y coordinate of the car
    private int carSpeed; // Speed of the car
    private boolean paused; // Whether the animation is paused or not
    private Text instructionsText; // Text displaying instructions
    
    @Override
    public void start(Stage primaryStage) {
        // Load the car image
        carImage = new Image("https://img.freepik.com/free-vector/modern-blue-urban-adventure-suv-vehicle-illustration_1344-205.jpg?w=740&t=st=1677027879~exp=1677028479~hmac=930f8fd5bac58ec4da7f7059181668d6a7559f66b589700db3aea4c34ca5f353");
        carImageView = new ImageView(carImage);
        carImageView.setFitWidth(CAR_WIDTH);
        carImageView.setFitHeight(CAR_HEIGHT);
        carImageView.setPreserveRatio(true);
        carX = 0;
        carY = HEIGHT / 2 - CAR_HEIGHT / 2;
        carSpeed = CAR_SPEED;
        paused = false;
        
        // Create a group for the car image
        Group carGroup = new Group(carImageView);
        
        // Create a timer for the animation
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!paused) {
                    // Update the X coordinate of the car
                    carX += carSpeed;
                    if (carX > WIDTH) {
                        carX = -CAR_WIDTH;
                    }
                    
                    // Redraw the car image with the new coordinates
                    carImageView.setX(carX);
                    carImageView.setY(carY);
                }
            }
        };
        timer.start();
        
        // Create a button for pausing/resuming the animation
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Create a text displaying instructions for how to use the simulation
        instructionsText = new Text("Press SPACE to pause/resume the simulation\nPress UP/DOWN to increase/decrease the car speed");
        instructionsText.getStyleClass().add("instructions");
        instructionsText.setX(10);
        instructionsText.setY(30);
        
        // Add the car group and instructions text to the pane
        pane.getChildren().addAll(carGroup, instructionsText);
        
        // Handle key presses for changing the speed and pausing/resuming the animation
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP) {
                carSpeed = Math.min(carSpeed + 1, CAR_MAX_SPEED);
            } else if (event.getCode() == KeyCode.DOWN) {
                carSpeed = Math.max(carSpeed - 1, CAR_MIN_SPEED);
            } else if (event.getCode() == KeyCode.SPACE) {
                paused = !paused;
            }
        });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}


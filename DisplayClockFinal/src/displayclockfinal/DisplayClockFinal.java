/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package displayclockfinal;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;


public class DisplayClockFinal extends Application {
  
  private ClockPane clock;
  private Timeline animation;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a clock and a label
    clock = new ClockPane();

    String timeString = clock.getHour() + ":" + clock.getMinute() 
      + ":" + clock.getSecond();
    Label lblCurrentTime = new Label(timeString);

    // Place clock and label in border pane
    BorderPane pane = new BorderPane();
    pane.setCenter(clock);
    pane.setBottom(lblCurrentTime);
    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

    // Add start and stop buttons to the pane
    Button btnStart = new Button("Start");
    Button btnStop = new Button("Stop");
    pane.setTop(btnStart);
    pane.setRight(btnStop);
    BorderPane.setAlignment(btnStart, Pos.TOP_CENTER);
    BorderPane.setAlignment(btnStop, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("DisplayClock"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    // Create animation to update the clock every second
    animation = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
      clock.setCurrentTime();
      String newTimeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
      lblCurrentTime.setText(newTimeString);
    }));
    animation.setCycleCount(Animation.INDEFINITE); // Repeat animation indefinitely
    
    // Set up event handlers for start and stop buttons
    btnStart.setOnAction(e -> startAnimation());
    btnStop.setOnAction(e -> stopAnimation());
  }

  // Start the animation
  private void startAnimation() {
    animation.play();
  }

  // Stop the animation
  private void stopAnimation() {
    animation.stop();
  }

  /**
   * The main method is only needed for IDEs with limited
   * JavaFX support. It is not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }

  /**
   * A simple clock class that extends Pane
   */
  public class ClockPane extends BorderPane {
    private int hour;
    private int minute;
    private int second;

    public ClockPane() {
      setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
    }

    public int getHour() {
      return hour;
    }

    public void setHour(int hour) {
      this.hour = hour;
      paintClock();
    }

    public int getMinute() {
      return minute;
    }

    public void setMinute(int minute) {
      this.minute = minute;
      paintClock();
    }

    public int getSecond() {
      return second;
    }

    public void setSecond(int second) {
      this.second = second;
      paintClock();
    }

public void setCurrentTime() {
      // Obtain the current time
      java.util.Calendar calendar = new java.util.GregorianCalendar();
      this.hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
      this.minute = calendar.get(java.util.Calendar.MINUTE);
      this.second = calendar.get(java.util.Calendar.SECOND);

      paintClock(); // Redraw the clock
    }

    protected void paintClock() {
      // Initialize clock parameters
      double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
      double centerX = getWidth() / 2;
      double centerY = getHeight() / 2;

      // Draw circle for the clock
      Circle circle = new Circle(centerX, centerY, clockRadius);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);

      // Draw the numbers on the clock
      Text[] numbers = new Text[12];
      for (int i = 0; i < 12; i++) {
        double numberX = centerX + clockRadius * Math.sin(i * Math.PI / 6);
        double numberY = centerY - clockRadius * Math.cos(i * Math.PI / 6);
        numbers[i] = new Text(numberX, numberY, "" + ((i == 0) ? 12 : i));
      }

      // Draw the hour hand
      double hourAngle = (hour % 12 + minute / 60.0) * (2 * Math.PI / 12);
      double hourRadius = clockRadius * 0.5;
      double hourX = centerX + hourRadius * Math.sin(hourAngle);
      double hourY = centerY - hourRadius * Math.cos(hourAngle);
      Line hourHand = new Line(centerX, centerY, hourX, hourY);
      hourHand.setStroke(Color.BLUE);
      hourHand.setStrokeWidth(3);

      // Draw the minute hand
      double minuteAngle = minute * (2 * Math.PI / 60);
      double minuteRadius = clockRadius * 0.7;
      double minuteX = centerX + minuteRadius * Math.sin(minuteAngle);
      double minuteY = centerY - minuteRadius * Math.cos(minuteAngle);
      Line minuteHand = new Line(centerX, centerY, minuteX, minuteY);
      minuteHand.setStroke(Color.GREEN);
      minuteHand.setStrokeWidth(2);

      // Draw the second hand
      double secondAngle = second * (2 * Math.PI / 60);
      double secondRadius = clockRadius * 0.8;
      double secondX = centerX + secondRadius * Math.sin(secondAngle);
      double secondY = centerY - secondRadius * Math.cos(secondAngle);
      Line secondHand = new Line(centerX, centerY, secondX, secondY);
      secondHand.setStroke(Color.RED);
      secondHand.setStrokeWidth(1);

      getChildren().clear();
      getChildren().addAll(circle, hourHand, minuteHand, secondHand);
      getChildren().addAll(numbers);
    }
  }
}

# Car Racing Simulation

This project is a JavaFX program that simulates car racing. The car moves from left to right and restarts from the left when it reaches the right edge of the window. The user can pause and resume the animation, and increase or decrease the speed of the car using the arrow keys.

## Example Output

![Sample Output](README.jpg)

## Analysis Steps

The requirements for this project were to create a program that simulates car racing using JavaFX. To accomplish this, we analyzed the requirements and designed a program that creates a window, loads a car image, and uses a timer to animate the movement of the car from left to right. The program also allows the user to pause and resume the animation, and increase or decrease the speed of the car using the arrow keys.

### Design

To design the program, we created a JavaFX application with a `start` method that creates a window and loads a car image. We then created a timer that updates the X coordinate of the car and redraws the car image with the new coordinates. We also added event handlers for key presses to handle changing the speed and pausing/resuming the animation.

### Testing

To test the program, we ran it and verified that the car image moves from left to right, restarts when it reaches the right edge of the window, and can be paused and resumed with the spacebar, and the speed can be adjusted using the up and down arrow keys. We also verified that the instructions for using the simulation are displayed in the GUI.

## Notes

This program requires JavaFX to be installed and configured on your system.

## Do not change content below this line

## Built With

* JavaFX - The GUI framework used

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* [Your Name] - *Initial work* - [Your GitHub username](https://github.com/yourusername)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc.


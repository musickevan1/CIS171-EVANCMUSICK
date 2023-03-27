## Project Title
JavaFX Text Field Example

## Example Output
Output.png
## Analysis Steps
The requirements for this project are to create a JavaFX program that dynamically adjusts the horizontal alignment and column size of a text field based on user input. To accomplish this, the program should have a text field, radio buttons for horizontal alignment, and a text field for column size.

To begin, I analyzed the requirements and decided to use a VBox to hold the text field, radio buttons, and column size text field. I used a ToggleGroup to group the radio buttons together, and set the initial alignment to center. For the column size text field, I added an event handler to adjust the column size of the text field and its width based on the value entered by the user.

## Design
For the design of the program, I used a single class that extends Application. I used JavaFX layout managers (VBox, HBox) to arrange the UI components, and used a monospace font to ensure that each character had the same width. I used lambda expressions to set the event handlers for the radio buttons and column size text field.

## Testing
Launch the program
Type some text in the main text field
Click the "Left" radio button - the text should move to the left of the text field
Click the "Right" radio button - the text should move to the right of the text field
Click the "Center" radio button - the text should move to the center of the text field
Enter a number in the column size text field and press Enter - the width of the text field should change based on the number of columns entered
Type more text in the main text field - the text should wrap to the next line based on the width of the text field
## Notes
Explain any issues or testing instructions.
## Do not change content below this line
## Adapted from a README Built With
* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework
used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds
## Contributing
Please read
[CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426
) for details on our code of conduct, and the process for submitting pull
requests to us.
## Versioning
We use [SemVer](http://semver.org/) for versioning. For the versions
available, see the [tags on this
repository](https://github.com/your/project/tags).
## Authors
* **Billie Thompson** - *Initial work* -
[PurpleBooth](https://github.com/PurpleBooth)
See also the list of
[contributors](https://github.com/your/project/contributors) who
participated in this project.
## License
This project is licensed under the MIT License - see the
[LICENSE.md](LICENSE.md) file for details
## Acknowledgments
* Hat tip to anyone who's code was used
* Inspiration
* etc

# Subway Order System

This is a Java Swing application developed to simplify the process of ordering at Subway. It allows users to choose from a variety of options including sandwich size, bread type, meat type, cheese type, up to three types of vegetables, sauce type, and optional extras.

## Example Output
![Sample Output](README.jpg)

## Analysis Steps
The task was to develop a GUI application that simulates a Subway order system. The program needed to include options for different sandwich sizes, types of bread, meat, cheese, vegetables, sauces, and extras. The chosen options are displayed in a summary when the user submits their order. To accomplish this, we used the Swing library in Java for the graphical user interface, and structured the program in a single class, SubwayOrderSystem.

### Design
The program is built around a single class, SubwayOrderSystem, which creates a JFrame and populates it with various UI components. These include JComboBoxes for the user to select their desired sandwich components, a JButton for order submission, and JLabels to identify the different options.

The createLabeledPanel method was used to create each labeled JComboBox, which were then added to a JPanel using a BoxLayout in the Y_AXIS orientation.

orderPanel.add(createLabeledPanel("Bread Type:", new JComboBox<>(breadTypes), vividGreen, labelFont, marigold));

### Testing
The first step in testing was to ensure that the UI displayed correctly and that all components were properly accessible to the user.

SwingUtilities.invokeLater(() -> new SubwayOrderSystem().createAndShowGUI());
The next step was to check the functionality of the JComboBoxes, ensuring they displayed the correct options and that the user could select from these options.

orderPanel.add(createLabeledPanel("Meat Type:", new JComboBox<>(meatTypes), vividGreen, labelFont, marigold));
Finally, we tested the "Submit Order" button to ensure that it properly generated a summary of the selected options and displayed this summary in a dialog box.

JOptionPane.showMessageDialog(frame, summary.toString(), "Order Summary", JOptionPane.INFORMATION_MESSAGE);
### Notes
Ensure the correct path to the icon and logo images are set in the createAndShowGUI() method.

## Do not change content below this line
## Adapted from a README Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc

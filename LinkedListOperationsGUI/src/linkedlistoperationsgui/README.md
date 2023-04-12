# Linked List Operations GUI

This project demonstrates a simple graphical user interface for performing operations on a LinkedList, such as inserting, searching, deleting, and displaying the LinkedList's contents.

## Example Output
![Sample Output](README.jpg)

## Analysis Steps
This project's goal is to create a user-friendly GUI that allows users to interact with a LinkedList by performing common operations. The requirements were analyzed to ensure the design included all necessary functionalities: inserting values at specified indices, searching for values within the list, deleting values based on index, and displaying the current LinkedList.

### Design
The design approach for this program was to create a single class, LinkedListOperationsGUI, which encapsulates the entire functionality of the application. This class is responsible for creating the UI components, handling user input, and managing the LinkedList. No additional classes were required for this simple implementation.


Examples of UI components include: JFrame, JTextField, JTextArea, JButton, and JLabel.
Examples of operations include: insertAction(), searchAction(), deleteAction(), and displayAction().

### Testing
A step-by-step series of examples were developed to properly test the program:

1. Insert a value into the LinkedList:
    Enter a value in the Value field and click the "Insert" button.
2. Insert a value at a specific index in the LinkedList:
    Enter a value in the Value field, enter an index in the Index field, and click the "Insert" button.
3. Search for a value in the LinkedList:
    Enter a value in the Value field and click the "Search" button.
4. Delete a value from the LinkedList based on index:
    Enter an index in the Index field and click the "Delete" button.
5. Display the current LinkedList:
    Click the "Display" button to view the current state of the LinkedList.
6. Perform a combination of these operations to ensure the program functions as expected and updates the LinkedList accordingly.

## Notes
If you are interested in expanding the capabilities of this application or personalizing the user interface components, feel free to make adjustments to the code within the LinkedListOperationsGUI class. It is crucial to thoroughly test the application after implementing any changes to verify that it continues to operate effectively and maintain a user-friendly experience.

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

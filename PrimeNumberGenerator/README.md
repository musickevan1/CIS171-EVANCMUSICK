# Project Title
Prime Number Generator

This program is designed to generate prime numbers up to a user-specified limit and store them in a binary data file named PrimeNumbers.dat. After generating the prime numbers, the user has the option to display them in the console.

## Example Output
This image will display as your example output. Name the image README.jpg in your project folder.
![Sample Output](README.jpg)

## Analysis Steps
1. Prompt the user to enter the maximum number `n` to find prime numbers up to that limit.
2. Generate prime numbers up to the specified limit.
3. Store the prime numbers in a binary data file named PrimeNumbers.dat.
4. Prompt the user whether they want to display the generated prime numbers.
5. If the user chooses to display the prime numbers, read them from the data file and display them in the console.

### Design
In this project, I used a single class named `PrimeNumberGenerator`. The program uses a `main` method to handle the user inputs, prime number generation, file writing, and optionally displaying the prime numbers.

### Testing
1. Test if the program correctly prompts the user to enter the maximum number `n`.
Find all prime numbers <= n, enter n: 100

2. Test if the program generates prime numbers up to the specified limit and stores them in the PrimeNumbers.dat file.
Check the PrimeNumbers.dat file for prime numbers up to 100.

3. Test if the program correctly prompts the user to display the prime numbers.
Do you want to display prime numbers after generation? (yes/no): yes

4. Test if the program displays the prime numbers when the user chooses to do so.
Prime numbers generation completed.
Prime numbers:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

## Notes
The program has been tested and works as expected. To test it, simply compile and run the program, then follow the prompts to enter the maximum number and choose whether to display the prime numbers. The generated prime numbers will be stored in the PrimeNumbers.dat file.

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

package com.mycompany.primenumbergenerator;

/*
 * Programmer: Evan Musick
 * Date: 4/4/2023
 * Course: 23/SP-CIS-171-W01
 * Instructor: Kirsten Markley
 * Description: This program finds all prime numbers up to a user-specified limit and stores them in a binary data file named PrimeNumbers.dat. The user has the option to display the prime numbers after generation.
 */

import java.io.*;

public class PrimeNumberGenerator {

    public static void main(String[] args) {
        System.out.print("Find all prime numbers <= n, enter n: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();

        System.out.print("Do you want to display prime numbers after generation? (yes/no): ");
        String displayPrimes = input.next();
        input.close();

        final String OUTPUT_FILE = "PrimeNumbers.dat";

        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(OUTPUT_FILE)))) {
            int count = 0; // Count the number of prime numbers
            int number = 2; // A number to be tested for primeness

            while (number <= n) {
                // Assume the number is prime
                boolean isPrime = true;

                // Test if number is prime
                for (int divisor = 2; divisor <= (int) (Math.sqrt(number)); divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break; // Exit the for loop
                    }
                }

                // Write the prime number to the file and increase the count
                if (isPrime) {
                    count++;
                    output.writeInt(number);
                }

                // Check if the next number is prime
                number++;
            }
            output.flush();
        } catch (IOException e) {
            System.err.println("An error occurred while generating prime numbers: " + e.getMessage());
        }

        System.out.println("Prime numbers generation completed.");

        if (displayPrimes.equalsIgnoreCase("yes")) {
            displayPrimeNumbers(OUTPUT_FILE);
        }
    }

    private static void displayPrimeNumbers(String fileName) {
        System.out.println("Prime numbers:");

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            while (input.available() > 0) {
                int prime = input.readInt();
                System.out.print(prime + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("An error occurred while reading prime numbers: " + e.getMessage());
        }
    }
}

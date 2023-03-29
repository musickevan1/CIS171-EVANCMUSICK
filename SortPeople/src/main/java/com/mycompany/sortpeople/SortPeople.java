/*
 * Programmer: Evan Musick
 * Date: 3/28/2023
 * Course: 23/SP-CIS-171-W01
 * Instructor: Kirsten Markley
 * Description: This program demonstrates how to sort an ArrayList of Person objects using a static
 *              sort method. The Person class has four fields (name, address, phone number, and
 *              email address), a constructor, getter methods, and a static method to load test data.
 *              The sort method takes an ArrayList of any type that implements Comparable, and uses
 *              a selection sort algorithm to sort the elements in ascending order. The main method
 *              creates an ArrayList of Person objects, prints it before and after sorting, and shows
 *              the names of the people in alphabetical order.
 */

import java.util.ArrayList;

public class SortPeople {
    public static void main(String[] args) {
        // Create an ArrayList of Person objects using the loadTestData method
        ArrayList<Person> people = Person.loadTestData();

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Person p : people) {
            System.out.println(p.getName());
        }

        // Sort the list using the static sort method
        sort(people);

        // Print the list after sorting
        System.out.println("After sorting:");
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }

    // Static method to sort an ArrayList of any type that implements Comparable
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Comparable temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }

    // Static nested class to represent a Person with four fields
    public static class Person implements Comparable<Person> {
        private String name;
        private String address;
        private String phoneNumber;
        private String emailAddress;

        // Constructor to set the four fields
        public Person(String name, String address, String phoneNumber, String emailAddress) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        // Getter methods to retrieve the four fields
        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        // Static method to load test data, returns an ArrayList of Person objects
        public static ArrayList<Person> loadTestData() {
            ArrayList<Person> list = new ArrayList<>();
            list.add(new Person("Alice", "123 Main St", "555-1234", "alice@example.com"));
            list.add(new Person("Bob", "456 Oak Ave", "555-5678", "bob@example.com"));
            list.add(new Person("Charlie", "789 Elm Blvd", "555-9012", "charlie@example.com"));
            return list;
        }

        // Override the compareTo method to compare Persons by name
        @Override
        public int compareTo(Person o) {
            return this.getName().compareTo(o.getName());
        }
    }
}
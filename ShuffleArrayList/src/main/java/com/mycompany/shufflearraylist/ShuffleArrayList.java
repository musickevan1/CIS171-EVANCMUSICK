/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shufflearraylist;

/**
 * Programmer: Evan Musick
 * Date: 3/28/2023
 * Course: 23/SP-CIS-171-W01
 * Instructor: Kirsten Markley
 *
 * This method shuffles the elements of an ArrayList using the Collections.shuffle() method.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
  
  /**
   * Shuffles the elements of the given ArrayList in place.
   * @param list the ArrayList to shuffle
   * @param <E> the type of the elements in the ArrayList
   */
  public static <E> void shuffle(ArrayList<E> list) {
    Collections.shuffle(list);
  }

  public static void main(String[] args) {
    // Create an ArrayList of integers
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    
    // Print the original ArrayList
    System.out.println("Original ArrayList: " + numbers);
    
    // Shuffle the ArrayList using the shuffle() method
    shuffle(numbers);
    
    // Print the shuffled ArrayList
    System.out.println("Shuffled ArrayList: " + numbers);
  }
}

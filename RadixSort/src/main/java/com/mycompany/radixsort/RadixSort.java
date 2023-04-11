/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radixsort;

/*
 * Title: Radix Sort
 * Author: Evan Musick
 * Date: 4/11/2023
 * Course: 23/SP-CIS-171-W01
 */

import java.util.Arrays;
import java.util.Random;

public class RadixSort {

    private static final int ARRAY_SIZE = 1_000_000;
    private static final int MAX_VALUE = 100_000;

    public static void main(String[] args) {
        // Generate 1,000,000 random integers
        int[] array = generateRandomIntegers(ARRAY_SIZE, MAX_VALUE);
        // Sort the array using radix sort
        radixSort(array);
        // Print the sorted array (Uncomment line below to print)
        System.out.println(Arrays.toString(array));
    }

    // Generate an array of random integers with the given size and maxValue
    public static int[] generateRandomIntegers(int size, int maxValue) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue);
        }

        return array;
    }

    // Find the maximum value in the array
    public static int getMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Radix sort implementation
    public static void radixSort(int[] array) {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, array.length, exp);
        }
    }

    // Counting sort implementation for radix sort
    public static void countSort(int[] array, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }
}

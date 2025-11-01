package com.numbers; /**
 * Java program to find numbers dividable by 3.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * com.numbers.Main class.
 */
public class Main {

    // com.numbers.Main method to run java program
    public static void main(String[] args) {

        // Creating LinkedList collection
        List<IntStream> list = new ArrayList<>();

        // Adding random 27 elements to the list in range [9 - 121)
        for (int index = 0; index < 27; index++) {

            list.add(new Random().ints(9, 121));

        }

        // Checking if numbers are dividable by 3 and printing to console
        for (int index = 0; index < 27; index++) {

            // Creating array of integers for check up
            Object[] arr = list.stream().toArray();

            // Condition
            if (System.identityHashCode(arr[index]) % 3 == 0) {

                System.out.println(arr[index] + " is dividable by 3");

            } else {

                System.out.println(arr[index] + " is not dividable by 3");

            }

        }
    }
}
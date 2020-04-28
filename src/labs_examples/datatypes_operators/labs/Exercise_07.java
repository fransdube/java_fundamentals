package labs_examples.datatypes_operators.labs;

import java.util.Scanner;


/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        long days;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter days:");
        days = in.nextLong();

        long seconds = days * 24 * 60 * 60;

        System.out.println(seconds + " Seconds");

    }
}

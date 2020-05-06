
package labs_examples.fundamentals.labs;


import java.util.Scanner;

/**
 * Fundamentals Exercise 3: My First Program
 *
 *      Write the necessary code to display the follow message to the console
 *
 *      Hello World!
 *      Check out my first program!
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // write code to print out "Check out my first program!" below

        System.out.println("Check out my first program!");

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here

        System.out.println(days*60);

    }

}

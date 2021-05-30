/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 08 - Pizza Party
 */

package org.example;
import java.util.Scanner;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Prompt user for input and store in an int datatype
        System.out.println("How many people?");
        Scanner numPeopleInput = new Scanner(System.in);
        int numPeople = numPeopleInput.nextInt();

        System.out.println("How many pizzas do you have?");
        Scanner numPizzasInput = new Scanner(System.in);
        int numPizzas = numPizzasInput.nextInt();

        // Exercise prompt asked for me to ask the user for this, but
        // sample output did not include it, so I added it anyway
        System.out.println("How many slices per pizza?");
        Scanner numSlicesInput = new Scanner(System.in);
        int numSlices = numSlicesInput.nextInt();

        // Print out the user's input
        System.out.println(numPeople + " people with " + numPizzas
                        + " pizzas with " + numSlices + " slices per pizza");

        // Calculate via division and find the remainder using the mod operator
        int slicesPerPerson = (numPizzas * numSlices) / numPeople;
        int leftoverSlices = (numPizzas * numSlices) % numPeople;

        // Print output
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza\n"
                            + "There are " + leftoverSlices + " leftover pieces.");
    }
}

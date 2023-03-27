import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double getAverage(int values[])
    {
        double sum = 0;
        for (int x = 0; x < values.length; x++) // loop to calculate sum
        {
            sum = sum + values[x]; // calculates the sum of all array values
        }
        return sum / values.length; // divides sum by number of values in the array to calculate the average
    }


    public static void main(String[] args) {

        // part 1
	    int ARRAY_SIZE = 100;
        int [] dataPoints = new int[ARRAY_SIZE]; // declare an array of type int named dataPoints
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for (int val = 0; val < dataPoints.length; val++)
        {
            dataPoints[val] = rnd.nextInt(100) + 1; // assign each element in the array a random number between 1-100
        }
        for (int val = 0; val < dataPoints.length; val++)
        {
            System.out.print(dataPoints[val] + " | "); // print all values separated by |
        }
        System.out.println(""); // print a new line between values and sum

        int sum = 0;
        for (int val = 0; val < dataPoints.length; val++) // loop to calculate sum
        {
            sum = sum + dataPoints[val]; // calculates the sum of all array values
        }
        int average = sum / dataPoints.length; // calculating the average by dividing the sum of all values by the number of values in the array

        System.out.println("The sum of the random array dataPoints is: " + sum); // print sum
        System.out.println("The average of the random array dataPoints is: " + average); // print average

        //part 2 - letters a & b
        int userValue = 0;

        System.out.println("");
        userValue = SafeInput.getRangedInt(in, "Enter a value to search for [1 - 100]: ", 1, 100); // calls the getRangedInt method and sets the range to 1-100

        int count = 0;
        boolean foundUserInput = false;
        for (int val = 0; val < dataPoints.length; val++)
        {
            if (dataPoints[val] == userValue) // checks to see if the number that the user entered is equal to each value in the array
            {
                foundUserInput = true;
                System.out.println("Found " + userValue + " at index " + val); // output to tell the user where the value is located in the array
                count = count + 1; // keeps count of the number of times the value comes up in the array
            }
        }
        if (!foundUserInput) // if the value that user entered is not in the array
        {
            System.out.println("Value " + userValue + " not found"); // output to tell user that value they entered is not found in the array
        }
        System.out.println("Value " + userValue + " found " + count + " time(s)"); // gives count of how many times the value that the user entered appears in the array

        // part 2 - letter c
        System.out.println("");
        userValue = SafeInput.getRangedInt(in, "Enter a value to search for [1 - 100]: ", 1, 100); // calls method getRangedInt and sets range to 1-100

        boolean foundInput = false;
        for (int val = 0; val < dataPoints.length; val++) // runs through each location in the array
        {
            if (dataPoints[val] == userValue) // if the value that the user entered is equal to a value in the array
            {
                foundInput = true; // the value that the user entered does appear in the array
                System.out.println("\nBreaking! Found " + userValue + " at array index " + val); // output to tell the user that the value they entered appears in the array and provides location
                break; // break to stop running the loop. only the first instance of the value will be output.
            }
        }
        if (!foundInput) // if the value that the user entered does not appear in the array
        {
            System.out.println("Value " + userValue + " not found"); // output to tell user that value they entered is not found in the array
        }

        //part 2 - letter d
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int val = 0; val < dataPoints.length; val++) // runs through each location in the array
        {
            if (min > dataPoints[val]) // if min is greater than the value that appears in the array
            {
                min = dataPoints[val]; // the value that appears in the array will be the new min. once we run through each location, we will have the lowest value in the array
            }
            if (max < dataPoints[val]) // if max is less than the value that appears in the array
            {
                max = dataPoints[val]; // the value that appears in the array will be the new max. once we run through each location, we will have the highest value in the array
            }
        }
        System.out.println("\nThe minimum value is " + min); // output the minimum value in the array
        System.out.println("The maximum value is " + max); // output the maximum value in the array

        //part 2 - letter e
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints)); // call the getAverage method to display the double average

    }
}

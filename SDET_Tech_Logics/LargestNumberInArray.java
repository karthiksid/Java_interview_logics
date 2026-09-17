package SDET_Tech_Logics;

import java.util.Random;

public class LargestNumberInArray {
     public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();

        // Generate random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Print the array
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Find largest number
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("\nLargest Number: " + largest);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("\nsmallest Number: " + smallest);

    }
}

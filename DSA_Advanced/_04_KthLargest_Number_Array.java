package DSA_Advanced;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _04_KthLargest_Number_Array {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int[] numberArray = new int[sizeOfArray];
        System.out.println("enter the kth highest element to be found");
        int kthElement = scanner.nextInt();
        scanner.close();

        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(100);
        }

        System.out.println("the numbers in the array are ");

        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

        Arrays.sort(numberArray);

        System.out.println("\nthe sorted arrays can be found below ");
        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

        int kthLargestElement = numberArray[numberArray.length-kthElement];

        System.out.println("\nthe kthLargestNumber is "+kthLargestElement);

    }
}

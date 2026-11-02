import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class _03_Largest_Smallest_Array {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int arraySize = scanner.nextInt();
        scanner.close();

        int[] numberArray = new int[arraySize];
        int[] numberArray2 = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = random.nextInt(100);
        }

for (int i = 0; i < arraySize; i++) {
            numberArray2[i] = random.nextInt(100);
        }


        System.out.println("the number array is ");

        for (int nums : numberArray) {
            System.out.print(nums + " ");
        }

        
        int largestNumber = numberArray[0];
        int smallestNumber = numberArray[0];

        for (int nums : numberArray) {
            if (nums > largestNumber) {
                largestNumber = nums;
            }
        }

        for (int nums : numberArray) {
            if (nums < smallestNumber) {
                smallestNumber = nums;
            }
        }

        System.out.println(
                "\nthe largest number in the array is " + largestNumber + " and the smallest is " + smallestNumber);

        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int nums : numberArray) {
            if (nums > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = nums;
            } else if (nums > secondLargestNumber && nums != firstLargestNumber) {
                secondLargestNumber = nums;
            }
        }

        System.out.println("the second largest number from the array is " + secondLargestNumber);

        Set<Integer> findDuplicates = new HashSet<>();
        System.out.println("the duplicates from the array are ");
        for (int nums : numberArray) {
            if (!findDuplicates.contains(nums)) {
                findDuplicates.add(nums);
            } else {
                System.out.print(nums + " ");
            }
        }
        System.out.println("\n the sorted numbers are");
        int placeholder;

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] > numberArray[j]) {
                        placeholder=numberArray[i];
                        numberArray[i]=numberArray[j];
                        numberArray[j]=placeholder;
                }
            }
        }

        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

        System.out.println("\n the second array numbers are ");
 for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray2[i] > numberArray2[j]) {
                        placeholder=numberArray2[i];
                        numberArray2[i]=numberArray2[j];
                        numberArray2[j]=placeholder;
                }
            }
        }

        for(int nums : numberArray2){
            System.out.print(nums+" ");
        }
        
System.out.println("\nthe common elements between 2 arrays are ");
        for(int nums_1 : numberArray){
            for( int nums_2 : numberArray2){
                if(nums_1==nums_2){
                    System.out.print(nums_1+" ");
                }
            }
        }

        System.out.println("\n the even numbers from the array can be foun below");

        for(int nums : numberArray){
            if(nums%2==0){
                System.out.print(nums+" ");
            }
        }

        System.out.println("\n the odd numbers from the array can be foun below");

        for(int nums : numberArray){
            if(nums%2!=0){
                System.out.print(nums+" ");
            }
        }

    }
}

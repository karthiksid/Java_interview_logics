package DSA_Advanced;

import java.util.*;

public class _02_LargestElement_Arrays {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int userInput = scanner.nextInt();
        scanner.close();
        int[] numberArray = new int[userInput];
        Random random = new Random();
        for(int i=0;i<numberArray.length;i++){
            numberArray[i]=random.nextInt(100);
        }

        System.out.println("the numbers in the array are");

        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

        int largestNumber=numberArray[0];

        for(int nums : numberArray){
            if(nums >largestNumber){
                    largestNumber=nums;
            }
        }

        System.out.println("\nthe largest number in the array is "+largestNumber);
    }
}

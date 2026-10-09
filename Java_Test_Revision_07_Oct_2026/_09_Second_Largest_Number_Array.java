import java.util.Random;
import java.util.Scanner;

public class _09_Second_Largest_Number_Array {
   
      public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int[] numbersArray = new int[sizeOfArray];

        Random random = new Random();

        for(int i=0;i<sizeOfArray;i++){
            numbersArray[i]=random.nextInt(100);
        }

        System.out.println("the numbers array can be found below");

        for(int numbers : numbersArray){
            System.out.print(numbers+" ");
        }

        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        
        for(int nums : numbersArray){
            if(nums>firstLargestNumber){
                secondLargestNumber=firstLargestNumber;
                firstLargestNumber=nums;
            }

            else if (nums > secondLargestNumber && nums!=firstLargestNumber){
                secondLargestNumber=nums;
            }
        }
        
        System.out.println("\nthe second largest num in array is "+secondLargestNumber);
        System.out.println("the first largest num in the array is "+firstLargestNumber);

    }
}

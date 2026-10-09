import java.util.Random;
import java.util.Scanner;

public class _08_Find_Largest_Smallest_Array {
    
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

        int largestNumber =numbersArray[0];
        int smallestNumber = numbersArray[0];

      
        for(int i=0;i<numbersArray.length;i++){

            if(numbersArray[i]>largestNumber){
                largestNumber=numbersArray[i];
            }

            if(numbersArray[i]<smallestNumber){
                smallestNumber=numbersArray[i];
            }
        }


        System.out.println("\nlargest number in the array is "+largestNumber);
        System.out.println("the smallest number in the array is "+smallestNumber);

    }
}

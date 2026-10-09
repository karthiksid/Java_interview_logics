import java.util.Random;
import java.util.Scanner;

public class _14_FInd_Sum_Array {

    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int[] numbersArray = new int[sizeOfArray];
        scanner.close();

        Random random = new Random();

        for(int i=0;i<numbersArray.length;i++){
            numbersArray[i]=random.nextInt(100);            
        }

        System.out.println("the numbers array can be found below");

        for(int nums : numbersArray){
            System.out.print(nums+" ");
        }

        int totalSum=0;

         for(int nums : numbersArray){
            totalSum = totalSum+nums;
        }

        System.out.println("\nthe total sum of array is "+totalSum);


    }
    
}

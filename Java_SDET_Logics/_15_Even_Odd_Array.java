import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * _15_Even_Odd_Array
 */
public class _15_Even_Odd_Array {

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

        Set<Integer> evenNumbers = new HashSet<>();

        Set<Integer> oddNumbers = new HashSet<>();

        for(int nums : numbersArray){

            if(nums==0){
                oddNumbers.add(nums);
            }

            else if(nums%2==0){
                evenNumbers.add(nums);
            }else{
                oddNumbers.add(nums);
            }
        }
        
        System.out.println("\nthe even numbers can be found below");
        System.out.print(evenNumbers);

         System.out.println("\nthe odd numbers can be found below");
        System.out.print(oddNumbers);

}
}
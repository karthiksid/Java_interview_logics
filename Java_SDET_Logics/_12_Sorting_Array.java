import java.util.Random;
import java.util.Scanner;

public class _12_Sorting_Array {
    
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

        int placeHolder;

        for(int i=0;i<numbersArray.length;i++){
            for(int j=i+1;j<numbersArray.length;j++){
                if(numbersArray[i]>numbersArray[j]){
                    placeHolder=numbersArray[i];
                    numbersArray[i]=numbersArray[j];
                    numbersArray[j]=placeHolder;
                }
            }
        }

        System.out.println("\nthe sorted array can be found below");

        for(int numbers : numbersArray){
            System.out.print(numbers+" ");
        }


    }
}

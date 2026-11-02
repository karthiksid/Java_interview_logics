package SDET_Tech_Logics;

import java.util.Random;
import java.util.Scanner;

public class SortAnArray {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");

        int sizeOfArray = scanner.nextInt();

        int[] numberArray = new int[sizeOfArray];

        Random random = new Random();

        for(int i=0;i<numberArray.length;i++){
            numberArray[i]=random.nextInt(100);
        }

        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

        int swapVariable;

        for(int i=0;i<numberArray.length;i++){
            for(int j=i+1;j<numberArray.length;j++){
                if(numberArray[i]>numberArray[j]){
                    swapVariable=numberArray[j];
                    numberArray[j]=numberArray[i];
                    numberArray[i]=swapVariable;
                }
            }
        }
System.out.println("\nThe sorted array can be found below");
        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

    }
}

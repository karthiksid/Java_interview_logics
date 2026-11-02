package SDET_Tech_Logics;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int[] numberArray = new int[sizeOfArray];

        int length = numberArray.length;
        Random random = new Random();

        for(int i=0;i<numberArray.length;i++){
            numberArray[i]=random.nextInt(100);
        }

        System.out.println("the numbers present in the array are");

        for(int num : numberArray){
            System.out.print(num+" ");
        }

        int  swapVaraible;

        for( int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){

                if(numberArray[j]>numberArray[j+1]){
                swapVaraible=numberArray[j];
                numberArray[j]=numberArray[j+1];
                numberArray[j+1]=swapVaraible;
                }
            }
        }

        System.out.println("\nthe sorted array is ");

        for(int num : numberArray){
            System.out.print(num+" ");
        }


    }
    
}

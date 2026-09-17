package SDET_Tech_Logics;

import java.util.Random;
import java.util.Scanner;

public class FindOddAndEvenNumberFromArray {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        scanner.close();
        int[] numberArray = new int[sizeOfArray];

        Random random = new Random();

        for(int i=0;i<numberArray.length;i++){
            numberArray[i]=random.nextInt(100);
        }

        System.out.println("the number array is ");

        for(int nums : numberArray){
            System.out.print(nums+" ");
        }

        System.out.println("\nthe even numbsers in the array are ");

        for(int nums : numberArray){
            if(nums%2==0){
                System.out.print(nums+" ");
            }
        }

        System.out.println("\nthe odd numbsers in the array are ");

        for(int nums : numberArray){
            if(nums%2!=0){
                System.out.print(nums+" ");
            }
        }


    }
}

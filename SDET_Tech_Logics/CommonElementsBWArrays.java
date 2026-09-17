package SDET_Tech_Logics;

import java.util.Random;
import java.util.Scanner;

public class CommonElementsBWArrays {

    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int[] numberArray1 = new int[sizeOfArray];
        int[] numberArray2 = new int[sizeOfArray];

                Random random = new Random();

        for(int i=0;i<numberArray1.length;i++){
            numberArray1[i]=random.nextInt(100);
        }

        System.out.println("the numbers present in the array1 are");

        for(int num : numberArray1){
            System.out.print(num+" ");
        }

          for(int i=0;i<numberArray2.length;i++){
            numberArray2[i]=random.nextInt(100);
        }

        System.out.println("\nthe numbers present in the array2 are");

        for(int num : numberArray2){
            System.out.print(num+" ");
        }


        System.out.println("\nthe common numbers present in both of arrays are");

        for(int num1:numberArray1){
            for (int num2:numberArray2){
                if(num1==num2){
                    System.out.print(num1+" ");
                }
            }
        }
        



    }    
}

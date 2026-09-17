package SDET_Tech_Logics;

import java.util.Random;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] NumberArray = new int[10];

        Random random = new Random();

        for (int i=0;i<NumberArray.length;i++) {
            NumberArray[i] = random.nextInt(100);
        }

        for(int num : NumberArray){
            System.out.print(num+" ");
        }

        int LargestNumber = Integer.MIN_VALUE;
        int SecondLargestNumber = Integer.MIN_VALUE;

        for (int num : NumberArray){
            if(num>LargestNumber){
                SecondLargestNumber=LargestNumber;
                LargestNumber=num;
            }
            else if(num>SecondLargestNumber && num!=LargestNumber){
                SecondLargestNumber=num;
            }
        }

        System.out.println("\nthe largest number is "+LargestNumber);
        System.out.println("the second largest number is "+SecondLargestNumber);

    }

}

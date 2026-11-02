package SDET_Tech_Logics;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DuplicateElementsInArray {
    
     public static void main(String[] args) {

        int[] NumberArray = new int[10];

        Random random = new Random();

        for (int i=0;i<NumberArray.length;i++) {
            NumberArray[i] = random.nextInt(100);
        }

        for(int num : NumberArray){
            System.out.print(num+" ");
        }

        Set<Integer> duplicateValues = new HashSet();

        System.out.println("\nthe duplicate values are");

        for(int nums : NumberArray){
            if(!duplicateValues.add(nums)){
                System.out.print(nums+" ");
            }
        }

    }
}

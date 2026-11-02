package DSA_Advanced;

import java.util.Set;
import java.util.TreeSet;

public class _03_Return_Indice_Target_Array {

    public static void main(String... args) {

        int[] numberArray = { -1, 0, 3, 5, 9, 12, 10, 1, 4, 7, 7, 3, 5, 9 };

        Set<Integer> treeSet = new TreeSet<>();

        for (int nums : numberArray) {
            treeSet.add(nums);
        }

        Integer[] numberSortedArray = treeSet.toArray(new Integer[0]);

        System.out.println("the sorted array is ");
        for (int nums : numberSortedArray) {
            System.out.print(nums + " ");
        }

        int target = 9;
        boolean isTargetFound = false;

        for (int i = 0; i < numberSortedArray.length; i++) {
            if (numberSortedArray[i].equals(target)) {
                isTargetFound = true;
                System.out.println("\nthe index of the target is found at " + i);
            }

        }

        if (isTargetFound == false) {
            System.out.println("the element is found at " + -1);
        }
    }

}

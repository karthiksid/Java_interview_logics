package DSA_Advanced;

import java.util.HashMap;
import java.util.Map;

public class _05_UniqueInteger {

    public static void main(String... args) {

        int[] numberArray = { 1, 2, 2, 4, 3, 1, 4, 9 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int nums : numberArray) {
            map.put(nums, map.getOrDefault(nums, 0) + 1);
        }
        System.out.println("unique numbers are");

        for (int nums : numberArray) {
            if (map.get(nums) == 1) {
                System.out.print(nums + " ");
            }
        }

    }

}

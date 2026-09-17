package SDET_Tech_Logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacterFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        // Display frequency
        System.out.println("Character Frequency:");

        for (char ch : map.keySet()) {

            System.out.println("the count of " + ch + " is found out to be " + map.get(ch));
        }

        // to find only the duplicates
        System.out.println("only duplicates found is ");

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println("the number of occurences of " + ch + " is " + map.get(ch));
            }
        }

    }

}

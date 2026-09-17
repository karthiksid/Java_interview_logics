package SDET_Tech_Logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count character frequency
        for (char ch : str.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);            
        }

        // Step 2: Find first character with count = 1
        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character: " + ch +" and the occurennce is "+map.get(ch));
                break;
            }
        }

        scanner.close();
    }
    
}

package Java_Logics_Revision_Test_12_Oct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_FirstNonRepeatedChar {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string :");
        String userInput = scanner.nextLine();

        Map<Character, Integer> duplicateCharacters = new HashMap<>();

        for (char ch : userInput.toCharArray()) {
            duplicateCharacters.put(ch, duplicateCharacters.getOrDefault(ch, 0) + 1);
        }

        for (char ch : userInput.toCharArray()) {
            if (duplicateCharacters.get(ch) == 1) {
                System.out.println(
                        "the first non repeated characters with " + ch + " count is  " + duplicateCharacters.get(ch));
                        break;
            }

        }

    }
}

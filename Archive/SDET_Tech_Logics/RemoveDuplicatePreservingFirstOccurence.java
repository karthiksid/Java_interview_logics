package SDET_Tech_Logics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatePreservingFirstOccurence {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        Set<Character> isCharPresent = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : userInput.toCharArray()) {

            if (!isCharPresent.contains(ch)) {
                isCharPresent.add(ch);
                result.append(ch);
            }
        }

        System.out.println("Original String: " + userInput);
        System.out.println("After Removing Duplicates: " + result);

        scanner.close();
    }
    
}

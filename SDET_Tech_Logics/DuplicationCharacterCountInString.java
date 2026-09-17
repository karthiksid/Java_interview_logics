package SDET_Tech_Logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicationCharacterCountInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> map = new HashMap<>();

        for( char ch : userInput.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for (char ch : map.keySet()){
            if(map.get(ch)>1){
                System.out.println("the duplicate found for "+ch+" is "+map.get(ch) );
            }
        }
    }
}
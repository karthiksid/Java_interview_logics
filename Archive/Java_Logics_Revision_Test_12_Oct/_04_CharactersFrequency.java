package Java_Logics_Revision_Test_12_Oct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_CharactersFrequency {
    
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string :");
        String userInput = scanner.nextLine();

        Map<Character,Integer> duplicateCharacters = new HashMap<>();

        for(char ch : userInput.toCharArray()){
            duplicateCharacters.put(ch,duplicateCharacters.getOrDefault(ch,0)+1);
        }

        for(char ch : duplicateCharacters.keySet()){
            
                System.out.println("the frequency of  characters with "+ch+" count is  "+duplicateCharacters.get(ch));
            

        }

    }
}

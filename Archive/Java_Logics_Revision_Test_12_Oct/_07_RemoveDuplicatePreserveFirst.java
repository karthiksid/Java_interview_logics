package Java_Logics_Revision_Test_12_Oct;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _07_RemoveDuplicatePreserveFirst {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string with duplicates");
        String userInput = scanner.nextLine();
        System.out.println("user has entered the string with duplicate values as "+userInput);
        
        Set<Character> nonDuplicatesChars = new HashSet<>();
        StringBuilder uniqueCharacters = new StringBuilder();
        
        for(char eachWord : userInput.toCharArray()){
            if(!nonDuplicatesChars.contains(eachWord)){
                nonDuplicatesChars.add(eachWord);
                uniqueCharacters.append(eachWord);
            }
        }

        System.out.println("the string containing only unique characters is "+uniqueCharacters);




    }
    
}

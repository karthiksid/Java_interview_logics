import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _07_RemoveDuplicatesPreservingFirst {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the string with duplicates : ");
        String userInput = scanner.nextLine();
        scanner.close();
        System.out.println("user has entered "+userInput);

        Set<Character> isCharacterPresent = new HashSet<>();

        StringBuilder NoDuplicateValues = new StringBuilder();

        for(char ch : userInput.toCharArray()){
            if(!isCharacterPresent.contains(ch)){
                isCharacterPresent.add(ch);
                NoDuplicateValues.append(ch);
            }
        }

        System.out.println("the string without duplicates can be found below");

        System.out.println(NoDuplicateValues);
        
    }
    
}

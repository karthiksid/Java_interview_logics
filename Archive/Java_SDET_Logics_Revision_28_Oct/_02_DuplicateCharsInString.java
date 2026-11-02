import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _02_DuplicateCharsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string to find the duplicate characters in the string");
        String userInput = scanner.nextLine();
        System.out.println("user entered text as : "+userInput);

        Map<Character,Integer> map = new HashMap<>();

        char[] userWords = userInput.toCharArray();

        for(char ch : userWords){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch)>1){
                System.out.println("the duplicate characters in the string are "+ch +" which is identified as  "+map.get(ch));
            }
        }

        System.out.println("the frequency of each char can be seen below");
        for(char ch : map.keySet()){
            
                System.out.println("the characters in the string are "+ch +" which is repeated as  "+map.get(ch));
            }

        System.out.println("the frequency of each char can be seen below");
        for(char ch : userWords){
            if(map.get(ch)==1){
                System.out.println("the characters which is first non repeated is  "+ch);
                break;
            }
                
            }

StringBuilder finalText = new StringBuilder();
            Set<Character> removeDuplicates = new HashSet<>();

            for(char words : userWords){
                if(!removeDuplicates.contains(words)){
                    removeDuplicates.add(words);
                    finalText.append(words);
                }
            }

            System.out.println("without duplicates and preserving first occurence is : "+finalText);

        
    }
}

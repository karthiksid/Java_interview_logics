import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _25_CharacterOccurencesCount {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
            System.out.println("enter the string details");
            String userInput = scanner.nextLine();
            scanner.close();

             Map<Character,Integer> map = new HashMap<>();
             
             for(char ch : userInput.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
             }

             for(char ch : map.keySet()){            
                System.out.println("character "+ch+" is "+map.get(ch));
             }

    }
}

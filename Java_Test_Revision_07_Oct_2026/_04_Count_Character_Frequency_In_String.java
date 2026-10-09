import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_Count_Character_Frequency_In_String {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string for which the frequency of characters needs to be checked");
        String userInput = scanner.nextLine();
        scanner.close();

        Map<Character,Integer> map = new HashMap<>();

        for( char ch : userInput.toCharArray()){           
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(char ch : map.keySet()){
            System.out.println("the frequency of "+ch+" in the string is "+map.get(ch));
        }

    }
    
}

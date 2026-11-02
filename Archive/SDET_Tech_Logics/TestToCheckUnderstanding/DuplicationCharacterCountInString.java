import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicationCharacterCountInString {

    public static void main(String[] args) {
        
        Scanner sf = new Scanner (System.in);
        System.out.println("enter the string");
        String userInput = sf.nextLine();
        sf.close();

        Map<Character,Integer> map = new HashMap<>();
        
        for (char ch : userInput.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for( char ch : map.keySet()){
            if(map.get(ch)>1){
                System.out.println("the duplicates in the string can be found as "+ch+" the occurence is "+map.get(ch));
            }
        }


    }
    
}

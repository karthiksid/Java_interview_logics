import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class _03_Duplicate_Characters_In_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string that has duplicate characters");
        String userInput = scanner.nextLine();
        System.out.println("user has entered : " + userInput);
        scanner.close();

        Map<Character,Integer> map = new HashMap<>();

        for (char ch : userInput.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(char ch : map.keySet()){
            if(map.get(ch)>1){
            System.out.println("the duplicate characters in the string of "+ch+" are "+map.get(ch));
            }            
        }
    }
    
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_First_Non_Repeated_Character_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string to findout the first non repeated character in the string");
        String userInput = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : userInput.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : userInput.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("the first non repeated character in the string is " + ch + " and has been repeated "
                        + map.get(ch));
                        break;
            }

        }

    }
}

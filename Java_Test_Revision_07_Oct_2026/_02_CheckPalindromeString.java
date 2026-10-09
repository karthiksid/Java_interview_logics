import java.util.Scanner;

public class _02_CheckPalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string that needs to be reversed");
        String userInput = scanner.nextLine();
        System.out.println("user has entered : " + userInput);
        scanner.close();
        String originalText = userInput.toLowerCase();
        int lengthOfUserInput = userInput.length();

        StringBuffer ReversedString = new StringBuffer();

        for (int i = lengthOfUserInput - 1; i >= 0; i--) {
            char reverseWord = userInput.toLowerCase().charAt(i);
            ReversedString.append(reverseWord);
        }

        System.out.println("the reverse of the user entered string is ");
        System.out.println(ReversedString);

        if(originalText.equalsIgnoreCase(ReversedString.toString())){
            System.out.println("the text entered is palindrome");
        }else{
            System.out.println("the text entered is not palindrome");
        }

    }

}

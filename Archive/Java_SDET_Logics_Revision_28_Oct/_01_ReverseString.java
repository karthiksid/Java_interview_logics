import java.util.Scanner;

public class _01_ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string which needs to be reversed");
        String userInput = scanner.nextLine();
        System.out.println("user has entered the text as : " + userInput);
        String originalText = userInput;

        StringBuilder reverseString = new StringBuilder();

        for (int i = userInput.length()-1; i >= 0; i--) {
            reverseString.append(userInput.charAt(i));
        }

        System.out.println("the reverse of the user input is " + reverseString);

        System.out.println(userInput.contentEquals(reverseString) ? "the entered string is palindrome"
                : "the entered string is not palindrome");

        String[] userWordsArray = userInput.split(" ");

        String reverseWordResult = "";

        for (String word : userWordsArray) {
            String reverseText = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reverseText = reverseText + word.charAt(i);
            }

            reverseWordResult = reverseWordResult+reverseText+" ";
        }
        System.out.println("the reverse of word without changing the order is : "+reverseWordResult);

        String exchangeText = "";
         
            for(int i=userWordsArray.length-1;i>=0;i--){
                exchangeText=exchangeText+userWordsArray[i]+" ";
            }

            System.out.println("the exchanged text is "+exchangeText);

        



    }

}

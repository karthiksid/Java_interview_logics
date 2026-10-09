import java.util.Scanner;

class Reverse_String_StringBuffer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string that needs to be reversed");
        String userInput = scanner.nextLine();
        System.out.println("user has entered : "+userInput);
        scanner.close();
        int lengthOfUserInput = userInput.length();

        StringBuffer ReversedString = new StringBuffer();

        for(int i=lengthOfUserInput-1;i>=0;i--){
            char reverseWord = userInput.charAt(i);
            ReversedString.append(reverseWord);
        }

        System.out.println("the reverse of the user entered string is ");
        System.out.println(ReversedString);




    }
}
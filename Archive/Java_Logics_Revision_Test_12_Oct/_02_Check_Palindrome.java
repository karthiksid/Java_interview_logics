package Java_Logics_Revision_Test_12_Oct;

import java.util.Scanner;

public class _02_Check_Palindrome {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string ");
        String userInput = scanner.nextLine();

        StringBuilder reverseTheString = new StringBuilder();

        String OriginalText = userInput;

        for(int i=userInput.length()-1;i>=0;i--){
            reverseTheString.append(userInput.charAt(i));                
        }

      System.out.println(userInput.contentEquals(reverseTheString)
        ? "The entered string is a palindrome"
        : "The entered string is not a palindrome");

    }
    
}

package SDET_Tech_Logics;

import java.util.Scanner;

public class PalindromeForStrings {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome");
        String userEnteredText = scanner.nextLine();
        scanner.close();

        StringBuilder reverseString = new StringBuilder();

        for(var i=userEnteredText.length()-1;i>=0;i--){
            reverseString.append(userEnteredText.charAt(i));
        }

        System.out.println("the user entered text is : "+userEnteredText);
        System.out.println("the reversed text is : "+reverseString);

        if(userEnteredText.contentEquals(reverseString)){
           System.out.println("the given word is palindrome"); 
        }else{
            System.out.println("the given word is not palindrome"); 
        }



    }

}

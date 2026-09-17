package SDET_Tech_Logics;

import java.util.Scanner;

public class ReverseStringWithSB {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string that needs to be reversed");
        String userInput = scanner.nextLine();
        scanner.close();

        StringBuilder reverseString = new StringBuilder();

        for(var i=userInput.length()-1;i>=0;i--){
            reverseString.append(userInput.charAt(i));
        }

        System.out.println("the original text is : "+userInput);
        System.out.println("the reversed string is : "+reverseString);

        

    }
    
}

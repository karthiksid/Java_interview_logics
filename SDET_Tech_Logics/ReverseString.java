package SDET_Tech_Logics;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner inputFromUser = new Scanner(System.in);

        //Getting the input from the user
        System.out.println("Enter the string that needs to be reversed");
        String userInput = inputFromUser.nextLine();

        System.out.println("the user has enetered : "+userInput);
        inputFromUser.close();

        String reversedInput = "";

        //implementing the logic without using reverse()

        for(var i=userInput.length()-1;i>=0;i--){
                reversedInput = reversedInput+userInput.charAt(i);
        }
    System.out.println("Original String: " + userInput);
    System.out.println("Reversed String: " + reversedInput);

        

        
    }
    
    
}

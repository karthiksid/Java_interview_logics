package SDET_Tech_Logics;

import java.util.Scanner;

public class SwapTwoNumbersWithoutOther {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number one ");
        int userInput_1 = scanner.nextInt();
        System.out.println("enter the number two ");
        int userInput_2 = scanner.nextInt();

        System.out.println("user has entered number_1 as "+userInput_1);
        System.out.println("user has entered number_2 as "+userInput_2);

        userInput_1=userInput_1 + userInput_2;
        userInput_2=userInput_1-userInput_2;
        userInput_1=userInput_1-userInput_2;

        System.out.println("logic has changed number_1 as "+userInput_1);
        System.out.println("logic has changed number_2 as "+userInput_2);


    }
    
}

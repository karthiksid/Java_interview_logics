package Java_Logics_Revision_Test_12_Oct;

import java.util.Scanner;

public class _01_Reverse_String_Using_SB {

    public static void main (String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string that needs to be reversed");
            String userInput = scanner.nextLine();
            System.out.println("user has enterd : "+userInput);

            int lengthOfUserInput = userInput.length();

            StringBuilder reverse = new StringBuilder();

            for(int i=lengthOfUserInput-1;i>=0;i--){
                reverse.append(userInput.charAt(i));
            }

            System.out.println("the reverse of the string is "+reverse);            


        
    }
    
}

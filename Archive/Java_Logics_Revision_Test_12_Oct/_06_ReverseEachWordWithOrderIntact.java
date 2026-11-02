package Java_Logics_Revision_Test_12_Oct;

import java.util.Scanner;

public class _06_ReverseEachWordWithOrderIntact {

    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string ");
        String userInput = scanner.nextLine();
        scanner.close();

        String[] userInputArray = userInput.split(" ");

        String reverseResult="";

        for(String word : userInputArray){
            String reverseWord="";
            for(int i=word.length()-1;i>=0;i--){
                reverseWord=reverseWord+ word.charAt(i);
            }
            reverseResult=reverseResult+reverseWord+" ";
        }

        System.out.println("the reverse of an string is "+reverseResult);



    }
    
}

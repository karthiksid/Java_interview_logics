package SDET_Tech_Logics;

import java.util.Scanner;

public class RemoveSpaceWithoutRemove {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the words for which the space needs to removed");
        String userInput = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();

        for(char ch : userInput.toCharArray()){
            if(!Character.isWhitespace(ch)){
                result.append(ch);
            }
        }

        System.out.println("without space the result is "+result);
    }
    
}

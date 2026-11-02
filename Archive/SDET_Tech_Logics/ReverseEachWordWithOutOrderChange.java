package SDET_Tech_Logics;

import java.util.Scanner;

public class ReverseEachWordWithOutOrderChange {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userinput = scanner.nextLine();

        // Split sentence into words
        String[] words = userinput.split(" ");

        String result = "";

        for (String word : words){

            String reverseWord = "";

            for(int i=word.length()-1;i>=0;i--){
                reverseWord = reverseWord+word.charAt(i);
            }

            result = result+reverseWord+" ";

        }
            System.out.println("the result is "+result);



       
    }

}

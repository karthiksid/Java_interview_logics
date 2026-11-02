package SDET_Tech_Logics;

import java.util.Scanner;

public class LargestWordInSentence {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String userInput = scanner.nextLine();
        scanner.close();
        System.out.println("user has entered : "+userInput);

        String[] words = userInput.split(" ");

        String largestWord ="";
        for( String word : words){

            if(word.length()>largestWord.length()){
                largestWord=word;
            }
        }

        System.out.println("the largest word in the sentence is "+largestWord);

    }
}

package SDET_Tech_Logics;

import java.util.Scanner;

public class ReplaceWordsInSentence {

    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");

        }
    }
    
}

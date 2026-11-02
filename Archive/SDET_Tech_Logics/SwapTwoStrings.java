package SDET_Tech_Logics;

import java.util.Scanner;

public class SwapTwoStrings {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string 1 : ");
        String word1 = scanner.nextLine();

         System.out.println("enter the string 2 : ");
        String word2 = scanner.nextLine();

        System.out.println("user has entered string_1 as : "+word1+" and string_2 as "+word2);

        word1 = word1+word2;
        word2=word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());

        System.out.println("logic has changed string_1 as : "+word1+" and string_2 as "+word2);

    }
}

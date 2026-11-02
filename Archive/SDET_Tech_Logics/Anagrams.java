package SDET_Tech_Logics;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main (String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string one");
        String userInput_1=scanner.nextLine();
        System.out.println("enter the string two");
        String userInput_2=scanner.nextLine();
        scanner.close();

        char[] ch1 = userInput_1.toLowerCase().toCharArray();
        char[] ch2 = userInput_2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("both strings are anagrams");
        }else{
            System.out.println("they are not anagrams");
        }
        

    }
    
}

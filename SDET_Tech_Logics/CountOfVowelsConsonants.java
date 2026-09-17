package SDET_Tech_Logics;

import java.util.Scanner;

public class CountOfVowelsConsonants {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string for which the count of consonants and vowels tobe found");
        String userInput = scanner.nextLine();

        int vowels=0;
        int consonants=0;

        for(char ch : userInput.toCharArray()){
            ch=Character.toLowerCase(ch);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else if(ch>='a' && ch<='z') {
                consonants++;

            }
        }

        System.out.println("the count of vowels is : "+vowels);
        System.out.println("the count of consonants is : "+consonants);
    }
    
    
}

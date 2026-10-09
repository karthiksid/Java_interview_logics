import java.util.Arrays;
import java.util.Scanner;

public class _21_Anagrams_Logic {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first string");
        String firstWord = scanner.nextLine();

        System.out.println("enter the second string");
        String secondWord = scanner.nextLine();


        System.out.println("user has entered the first word as "+firstWord+" and the second word as "+secondWord);

        char[] firstword = firstWord.toLowerCase().toCharArray();
        char[] secondword = secondWord.toLowerCase().toCharArray();
       
        Arrays.sort(firstword);
        Arrays.sort(secondword);

        if(Arrays.equals(firstword, secondword)){
            System.out.println("the words are anagrams");
        }else{
            System.out.println("the two words are not the anagrams");
        }

    }
}

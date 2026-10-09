import java.util.Scanner;

public class _27_SwapTwoStrings {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the first string ");
        String firstWord = scanner.nextLine();

        System.out.println("enter the second string ");
        String secondWord = scanner.nextLine();

        System.out.println("The first word entered is "+firstWord+" and the second word is "+secondWord);

        firstWord=firstWord+secondWord;
        secondWord=firstWord.substring(0,firstWord.length()-secondWord.length());
        firstWord=firstWord.substring(secondWord.length());

        System.out.println("after the swap");

        System.out.println("The first word is "+firstWord+" and the second word is "+secondWord);


        

    }
    
}

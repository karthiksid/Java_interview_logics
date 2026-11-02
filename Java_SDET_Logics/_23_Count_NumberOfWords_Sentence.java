import java.util.Scanner;

public class _23_Count_NumberOfWords_Sentence {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string which needs to be verified");
        String userInput = scanner.nextLine();

        System.out.println("user has entered the string as "+userInput);

        String[] words = userInput.split(" ");

        int countOfWords = words.length;

        System.out.println("the number of words in sentence is "+countOfWords);

    
    }
}

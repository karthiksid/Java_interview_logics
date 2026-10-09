import java.util.Scanner;

public class _22_LargestWord_Sentence {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string which needs to be verified");
        String userInput = scanner.nextLine();

        System.out.println("user has entered the string as "+userInput);

        String[] words = userInput.split(" ");

        String largestWord="";
        String smallestWord="";

      for(String eachWord : words){
        if(eachWord.length()>largestWord.length()){
          largestWord=eachWord;
        }
      }

      System.out.println("the largest word is "+largestWord);

    }
}

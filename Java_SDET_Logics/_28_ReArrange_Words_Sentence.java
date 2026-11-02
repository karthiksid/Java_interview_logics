import java.util.Scanner;

public class _28_ReArrange_Words_Sentence {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string details");
        String userInput = scanner.nextLine();
        scanner.close();

        System.out.println("user has entered "+userInput);

        String[] words = userInput.split(" ");


        for(int i=words.length-1;i>=0;i--){

            System.out.print(words[i]+" ");
            
        }




    }
}

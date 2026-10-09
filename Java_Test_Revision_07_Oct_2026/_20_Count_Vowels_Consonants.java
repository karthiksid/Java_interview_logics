import java.util.Scanner;

/**
 * _20_Count_Vowels_Consonants
 */
public class _20_Count_Vowels_Consonants {

    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string for which the vowels and consonants should be counted");
        String userInput = scanner.nextLine();

        int vowelsCount=0;
        int consonantsCount=0;

        for(char ch : userInput.toCharArray()){
            if (ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelsCount++;
            }else{
                consonantsCount++;
            }
        }
        
        System.out.println("the total count of Vowels is "+vowelsCount+" and consonants count is "+consonantsCount);
    }

}
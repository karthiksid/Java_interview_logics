import java.util.Scanner;

/**
 * _26_ReverseTheNumber
 */
public class _26_ReverseTheNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number which needs to be reversed");
        int userInput = scanner.nextInt();
        System.out.println("user entered the number " +userInput);
        scanner.close();

        StringBuffer sb = new StringBuffer();
        sb.append(userInput);

        sb=sb.reverse();

        String number = sb.toString();
        int reverseNumber = Integer.parseInt(number);
        
        System.out.println("the reverse of the number is "+reverseNumber);
        
            
        }

    }


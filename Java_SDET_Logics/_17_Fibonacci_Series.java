import java.util.Scanner;

/**
 * _17_Fibonacci_Series
 */
public class _17_Fibonacci_Series {

    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for which the fibonacci has to be entered");
        int userInput = scanner.nextInt();
        System.out.println("user has entered the number as "+userInput);
        int firstNum=0;
        int secondNum=1;
        int totalSum=0;

        System.out.println("the fibonacci series range is ");

        System.out.print(firstNum +" "+secondNum+" ");
        for(int i=1;i<=userInput;i++){

            totalSum =firstNum+secondNum;
            System.out.print(totalSum+" ");            
            firstNum=secondNum;
            secondNum=totalSum;
        }

    }

    
}
import java.util.Scanner;

public class _18_Factorial_Of_GivenNumber {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for which the factorial of given ");
        int userInput = scanner.nextInt();
        System.out.println("user has entered the number as "+userInput);

        int factorial = 1;
        for(int i=1;i<=userInput;i++){
            factorial=factorial*i;
        }

        System.out.println("the factorial of the number "+userInput+ " is " +factorial);


    }
}

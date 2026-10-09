import java.util.Scanner;

public class _19_SwapTwoNumbers_WIthout_Anamoly {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("enter the second number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("before swapping the first number is "+firstNumber+" and second number is "+secondNumber);

        firstNumber = firstNumber+secondNumber;
        secondNumber=firstNumber-secondNumber;
        firstNumber= firstNumber-secondNumber;

        System.out.println("after swapping the first number is "+firstNumber+" and second number is "+secondNumber);


    }
    
}

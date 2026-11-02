import java.util.Scanner;

public class _06_SwapTwoNumbers {

    public static void main (String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number 1 :");
        int number_1 = scanner.nextInt();
        System.out.println("Enter the Number 2 :");
        int number_2 = scanner.nextInt();
        scanner.close();

        System.out.println("user entered number 1 as " +number_1+" and number 2 as "+number_2);

        number_1=number_1+number_2;
        number_2=number_1-number_2;
        number_1=number_1-number_2;

        System.out.println("after ecchanges number 1 as " +number_1+" and number 2 as "+number_2);

    }
    
}

import java.util.Scanner;

public class _16_PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number to verify prime number or not : ");

        int userInput = scanner.nextInt();

        System.out.println("user has entered " + userInput);

        System.out.println("is the number prime ?" + VerifyPrimeNumber(userInput));

    }

    public static boolean VerifyPrimeNumber(int num) {

        boolean isPrime = true;

        if (num == 0 || num < 1) {
            isPrime = false;
        
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }

        return isPrime;
    }

}

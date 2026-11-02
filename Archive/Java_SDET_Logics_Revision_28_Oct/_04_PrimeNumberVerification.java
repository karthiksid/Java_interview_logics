import java.util.Scanner;

public class _04_PrimeNumberVerification {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number which needs to be verified for prime numbers");
        int userInput = scanner.nextInt();
        System.out.println(isPrimeNumber(userInput));

        System.out.println("Prime numbers in the range are ");
        for(int i=0;i<userInput;i++){
                if(isPrimeNumber(i)){
                    System.out.print(i+" ");
                }
        }
    }

    public static boolean isPrimeNumber(int num) {
        boolean isPrime = true;

        if (num == 1 || num < 0) {
            isPrime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }

}

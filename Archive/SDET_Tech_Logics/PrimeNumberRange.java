package SDET_Tech_Logics;

import java.util.Scanner;

public class PrimeNumberRange {
    
     public static boolean isPrimeOrNot(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Prime numbers from 0 to " + n + ": ");

        for (int number = 0; number <= n; number++) {

            if (isPrimeOrNot(number)) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}


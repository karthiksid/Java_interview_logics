package SDET_Tech_Logics;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for which the factorial needs to be verified");
        int userInput = scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=userInput;i++){
            factorial=factorial*i;
        }

        System.out.println("the factorial for given number is :"+factorial);

    }
    
}

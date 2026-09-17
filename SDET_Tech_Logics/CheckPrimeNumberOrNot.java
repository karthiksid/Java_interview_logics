package SDET_Tech_Logics;

import java.util.Scanner;

public class CheckPrimeNumberOrNot {
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to check prime or not");
        int userInput = scanner.nextInt();
        scanner.close();

        boolean isPrimeNumber = true;        

        if(userInput<=1){
            isPrimeNumber=false;            
        }else{

            for(int i=2;i<userInput;i++){
                if(userInput%i==0){
                     isPrimeNumber=false;
                     break; 
                }
            }
        }

        if(isPrimeNumber){
            System.out.println("the number is prime");
        }else{
            System.out.println("the number is not prime");
        }

        System.out.println("prime numbers in the range are ");

        for(int i=2;i<userInput;i++){
            if(isPrimeNumber){
                System.out.print(i+" ");
            }
        }


    }
}

package SDET_Tech_Logics;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to find the fibonacci");
        int userInput = scanner.nextInt();
        scanner.close();

        int first=0,second=1;
        int next=0;

        for(int i=0;i<userInput;i++){
            System.out.print(first+ " ");
            next = first+second;
            first=second;
            second=next;
        }        

    }
    
}

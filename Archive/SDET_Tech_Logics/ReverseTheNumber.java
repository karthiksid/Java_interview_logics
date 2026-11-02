package SDET_Tech_Logics;

import java.util.Scanner;

public class ReverseTheNumber {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int userInput = scanner.nextInt();
        scanner.close();

        int reverse =0;
        int temp=0;
        
        while(userInput!=0){
             temp= userInput%10;
             reverse = reverse*10+temp;
             userInput=userInput/10;
        }

        System.out.println("the reverse of given number is "+reverse);



     }   
}

import java.util.Scanner;

public class _05_FibonacciSeries {

public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the range of fibonacci series");    
    int userInput = scanner.nextInt();
    scanner.close();

    int first =0;
    int second =1;
    int sum;
    System.out.print(first +" " +second+" ");

    for(int i=1;i<=userInput;i++){
        sum=first+second;
        System.out.print(sum+" ");
        first=second;
        second=sum;
    }
}
    
}

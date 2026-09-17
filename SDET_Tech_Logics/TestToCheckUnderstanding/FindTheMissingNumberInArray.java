package SDET_Tech_Logics.TestToCheckUnderstanding;

public class FindTheMissingNumberInArray {
    
    public static void main(String[] args){
        
        int[] numbers ={1,2,3,5,6};

        int n = numbers.length+1;

        int actualSum =0;

        int expected = n*(n+1)/2;

        System.out.println(expected);

        for( int nums : numbers){
            actualSum = actualSum+nums;
        }

        System.out.println(actualSum);

        int missingNumber =expected- actualSum;
        System.out.println(missingNumber);

     }
}

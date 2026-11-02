public class _11_Find_The_Missing_Numbers {
    
    public static void main(String[] args){

        int[] numbersArray = {1,2,3,4,5,7};

        int n = numbersArray.length+1;

        int totalSum = (n*(n+1))/2;
        System.out.println(totalSum);

        int totalSumOfArray = 0;

        for(int nums : numbersArray){
            totalSumOfArray = totalSumOfArray+nums;
        }

        System.out.println(totalSumOfArray);

        int missingNumber = totalSum-totalSumOfArray ;


        System.out.println("the missing number in the array is "+missingNumber);
    }

}

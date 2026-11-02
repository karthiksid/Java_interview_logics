package DSA_Advanced;

public class _01_ReturnIndices_TargetMatching {

    public static void main (String... args){

        int[] numberArray = {1, 6, 2, 10, 3,1,8};

        int target=11;

        for(int i=0;i<numberArray.length;i++){
            for(int j=i+1;j<numberArray.length;j++){
                if (numberArray[i]+numberArray[j]==target){
                    System.out.println("the indices are "+i+" and "+j);
                    System.out.println("the values of indices are "+numberArray[i]+" and "+numberArray[j]);
                    //return ;
                }

            }
        }
        System.out.println("no such elements are present");

    }
    
}

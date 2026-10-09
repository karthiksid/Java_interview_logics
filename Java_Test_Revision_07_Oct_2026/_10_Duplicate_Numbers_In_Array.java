import java.util.*;

public class _10_Duplicate_Numbers_In_Array {
 
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int sizeOfArray = scanner.nextInt();
        int[] numbersArray = new int[sizeOfArray];
        Random random = new Random();
        int arrayLength = numbersArray.length;

        for(int i=0;i<arrayLength;i++){
            numbersArray[i]=random.nextInt(100);
        }

        System.out.println("the numbers array can be found below");

        for(int nums : numbersArray){
            System.out.print(nums+" ");
        }

        Set<Integer> nonDuplicateNumbers = new HashSet();

System.out.println("\nthe duplicates found can be seen below");
        for(int nums : numbersArray){
            if(!nonDuplicateNumbers.contains(nums)){
                nonDuplicateNumbers.add(nums);
            }else{
                    System.out.print(nums+" ");
                }
        }

        System.out.println("\nthe non dupliates can be found below");

            System.out.println(nonDuplicateNumbers);
        



    }    

}

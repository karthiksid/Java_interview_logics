import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class _13_Common_Elements_Arrays {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the arrays");
        int sizeOfArray = scanner.nextInt();
        int[] numbersArray_01 = new int[sizeOfArray];
        int[] numbersArray_02 = new int[sizeOfArray];

        Random random = new Random();

        for(int i=0;i<numbersArray_01.length;i++){            
            numbersArray_01[i]=random.nextInt(100);
        }

        for(int i=0;i<numbersArray_02.length;i++){            
            numbersArray_02[i]=random.nextInt(100);
        }

        System.out.println("the numbers present in the array' can be found below");

        System.out.println("*******************Number Array_01********************");

        for(int nums : numbersArray_01){
            System.out.print(nums+" ");
        }
Set<Integer> DuplicatesPresent = new HashSet<>();

        System.out.println("\n*******************Number Array_02********************");
        
         for(int nums : numbersArray_02){
            System.out.print(nums+" ");
        }
System.out.println("\ncommon elements are ");
        for(int num_01 : numbersArray_01){
            for(int num_02 : numbersArray_02){
                if(num_01==num_02){
                    DuplicatesPresent.add(num_01);                    
                }
                
            }
           
        }
         System.out.print(DuplicatesPresent);

    }
}

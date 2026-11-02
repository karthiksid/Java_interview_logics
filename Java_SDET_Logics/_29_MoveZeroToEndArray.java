
public class _29_MoveZeroToEndArray {

    public static void main(String... args) {

        int[] NumberArray = { 0, 1, 0, 2, 0, 3, 0, 4, 0 };

        
        int nonZeroIndex = 0;
        int temp;

        for (int i = 0; i < NumberArray.length; i++) {
            if (NumberArray[i] != 0) {
                 temp = NumberArray[nonZeroIndex];
                NumberArray[nonZeroIndex] = NumberArray[i];
                NumberArray[i] = temp;
                nonZeroIndex++;    
            }            
        }

        for (int nums : NumberArray) {
            System.out.print(nums + " ");
        }

    }

}
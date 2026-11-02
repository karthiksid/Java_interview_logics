
public class _32_SubArraySum {

    public static void main(String[] args) {

        int[] NumberArray = { 1, 2, 3, 4, 5, 6, 2 };
        int target = 8;
        boolean subArrayFound = false;

        for (int i = 0; i < NumberArray.length; i++) {
            int sum = 0;

            for (int j = i; j < NumberArray.length; j++) {
                sum = sum + NumberArray[j];

                if (sum == target) {
                    subArrayFound=true;
                    System.out.println("SubNumber Array found ");

                    for (int k = i; k <= j; k++) {
                        System.out.print(NumberArray[k] + " ");
                    }
                }
            }

            
        }
        if(subArrayFound==false){
                System.out.println("SubArray is not found");
            }


    }
}

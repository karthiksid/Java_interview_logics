import java.util.Scanner;

public class _24_RemoveEmptySpaceWithoutRemove {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String userInput = scanner.nextLine();
        scanner.close();

        StringBuilder addWithOutEmptySpace = new StringBuilder();

        for(char ch : userInput.toCharArray()){
            if(!Character.isWhitespace(ch)){
                addWithOutEmptySpace.append(ch);
            }
        }

        System.out.println("the string without empty space can be seen as "+addWithOutEmptySpace);




    }
}


import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
        String inp = (reader.nextLine());
        int leng = calculateCharacters(inp);
        System.out.println("Number of characters: " + leng);
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        int leng = text.length();
        return leng;
    }
    
}

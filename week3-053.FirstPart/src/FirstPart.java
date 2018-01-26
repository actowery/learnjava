
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String str = reader.nextLine();
        System.out.println("Length of the first part: ");
        int leng = Integer.parseInt(reader.nextLine());
        String firstpart = str.substring(0, leng);
        System.out.println("Result: " + firstpart);
        
    }
}


import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String inp = reader.nextLine();

        for (int i=0; i<inp.length(); i++){
            System.out.println((i+1) + ". character: " + inp.charAt(i));
        }
    }
}

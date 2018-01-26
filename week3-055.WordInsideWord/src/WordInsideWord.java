
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String str1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String str2 = reader.nextLine();
        String not = "";
        if (str1.indexOf(str2)==-1){
            not = "not";
        }
        System.out.println("The word '" + str2 + "' is " + not + " found in the word '" + str1 + "'.");
    }
}

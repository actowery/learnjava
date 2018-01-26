
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Keep inputting words. If You repeat yourself the program will end");
        String word;
        while (true) {
            word = reader.nextLine();
            if (words.contains(word)) {
                break;
            }
            words.add(word);
        }
        System.out.println("You gave the word" + word + "twice");
    }
}

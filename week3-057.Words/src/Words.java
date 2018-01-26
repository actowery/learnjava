import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Keep typing words and press enter. Leave blank and press enter to quit");
        while(true){
            String str = reader.nextLine();
            if (str.isEmpty()){
                break;
            }
            words.add(str);
        }
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
        String inp = (reader.nextLine());
        char leng = firstCharacter(inp);
        System.out.println("First character: " + leng);
    }
    
    // do here the method
    public static char firstCharacter(String text){
        return text.charAt(0);
    }
}
    
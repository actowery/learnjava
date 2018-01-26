import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String inp = reader.nextLine();
        System.out.print("In reverse order: ");
        
        for (int i=(inp.length()-1); i >=0; i--){
            System.out.print(inp.charAt(i));
        }
    }
}

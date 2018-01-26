import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String inp = reader.nextLine();
        if (inp.length() < 3)
            return;
        for (int i=0; i<3; i++){
            System.out.println((i+1) + ". character: " + inp.charAt(i));
        }
                
    }
}

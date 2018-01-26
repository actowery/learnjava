
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());        
        int x=1;
        while (x <=num){
            System.out.println(x);
            x++;
        }       
    }
}

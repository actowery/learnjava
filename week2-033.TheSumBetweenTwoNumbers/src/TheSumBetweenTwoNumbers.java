
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        int num2 = Integer.parseInt(reader.nextLine());
        int sum =0;
        while (num <= num2){
            sum+=num;
            num++;
        }
        System.out.println(sum);
    }
}

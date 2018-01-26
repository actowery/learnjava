
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        int x=0, sum=0;
        while (x <=num){
            sum += Math.pow(2,x);
            x++;
            System.out.println(sum+ "The result is "+ sum);
        }
    }
}

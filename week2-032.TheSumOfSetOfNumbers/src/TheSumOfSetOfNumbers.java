
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        System.out.println("Sum is " + sumup(num));
    }
    public static long sumup(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result += factor;
        }

        return result;
    }
}

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        System.out.println("Factorial is "+factorial(num));
    }
    public static long factorial(int num) {
    long result = 1;
    for (int factor = 2; factor <= num; factor++) {
        result *= factor;
    }

    return result;
    }
}

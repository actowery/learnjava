
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int result;
        if (number1 > number2) {
            if (number1 > number3)
                return number1;
            return number3;
        }
        else {
            if (number2 > number3)
                return number2;
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}

import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
//      length 0 or 1 is an automatic palindrome
        if (text.length() <= 1) {
            return true;
        }
        int end = text.length() -1;
//      instead of copying the array in reverse as suggested, which creates 
//      multiple iterations at worst case 2n, now we simply refer the string
//      to itself, creating worst case n/2
        for (int i = 0; i <= end/2; i++) {
            if (text.charAt(i) != text.charAt(end-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

import java.util.*;
public class palindrome_checker {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.println("Welcome to my second task of LEVEL-1!!");
        System.out.println("Enter a word or number: ");
        String input = df.nextLine();
        df.close();
        if (palindrome(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
    }
    public static boolean palindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

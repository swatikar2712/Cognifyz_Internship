import java.util.*;
public class random_password_generator {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.println("Welcome to my FOURTH task of LEVEL-1!!");
        System.out.println("Enter length of the password: ");
        int len = pk.nextInt();
        System.out.print("Include numbers? (y/n): ");
        boolean numbers = pk.next().equals("y");
        System.out.print("Include lowercase letters? (y/n): ");
        boolean lowercase = pk.next().equals("y");
        System.out.print("Include uppercase letters? (y/n): ");
        boolean uppercase = pk.next().equals("y");
        System.out.print("Include special characters? (y/n): ");
        boolean special = pk.next().equals("y");
        String password = generatepass(len, numbers, lowercase, uppercase, special);
        System.out.println("Generated Password: " + password);
        pk.close(); }
    public static String generatepass(int len, boolean numbers, boolean lowercase,
                                          boolean uppercase, boolean special) {
        StringBuilder password = new StringBuilder();
        String chars = "";
        if (numbers) chars += "0123456789";
        if (lowercase) chars += "abcdefghijklmnopqrstuvwxyz";
        if (uppercase) chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (special) chars += "!@#$%^&*()-_=+";
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            password.append(chars.charAt(rand.nextInt(chars.length()))); }
        return password.toString(); }}

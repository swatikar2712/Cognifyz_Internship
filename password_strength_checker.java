import java.util.*;
public class password_strength_checker {
    public static void main(String[] args) {
        Scanner fg = new Scanner(System.in); 
        System.out.println("WELCOME TO MY SECOND TASK OF LEVEL-2!!");
        boolean validpass = false;
        while (!validpass) {
            System.out.println("Enter your password:");
            String pass = fg.nextLine();    
            int length = pass.length();
            boolean uppercase = !pass.equals(pass.toLowerCase());
            boolean lowercase = !pass.equals(pass.toUpperCase());
            boolean digit = pass.matches(".*\\d.*");
            boolean specialchar = !pass.matches("[A-Za-z0-9 ]*");
            if (length < 8) {
                System.out.println("Enter at least 8 characters.");}
             else if (!uppercase) {
                System.out.println("Enter at least one uppercase letter.");}
             else if (!lowercase) {
                System.out.println("Enter at least one lowercase letter.");}
             else if (!digit) {
                System.out.println("Enter at least one digit.");}
             else if (!specialchar) {
                System.out.println("Enter at least one special char.");}
             else {
                System.out.println("Strong password!");
                validpass = true;}}             
        fg.close();}}


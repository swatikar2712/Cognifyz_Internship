import java.util.*;
public class temperature_converter {
	public static void main(String[] args) {
        Scanner zd = new Scanner(System.in);
        System.out.println("Welcome to my first task of LEVEL-1!!");
        System.out.println("Enter the temperature value:");
        float temperature = zd.nextFloat();
        System.out.println("Enter the unit of measurement (C or F ):");
        String value = zd.next();
        float conversion;
        if (value.equals("C")) {
            conversion = ctof(temperature);
            System.out.println("Converted temperature: " + conversion + " F");
        } else if (value.equals("F")) {
            conversion = ftoc(temperature);
            System.out.println("Converted temperature: " + conversion + " C");
        } else {
            System.out.println("Invalid unit of measurement");
        }
        zd.close();
    }
    public static float ctof(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static float ftoc(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

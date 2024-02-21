import java.util.*;
public class student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my THIRD task of LEVEL-1!!");
        System.out.print("Enter the number of grades: ");
        int num = sc.nextInt();
        int[] grades = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        float average = sum / num;
        System.out.println("Average grade: " + average);
        sc.close();
    }
}


import java.util.Scanner;

class Student {
    // Instance variable
    int mark;

    // Method parameter: bonus
    void showFinalMark(int bonus) {
        // Local variable: finalMark
        int finalMark = mark + bonus;

        // Print original mark and final mark
        System.out.println(mark);
        System.out.println(finalMark);
    }
}

public class instantparameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Student object
        Student student = new Student();

        // Read inputs
        student.mark = scanner.nextInt();
        int bonus = scanner.nextInt();

        // Call method
        student.showFinalMark(bonus);

        scanner.close();
    }
}
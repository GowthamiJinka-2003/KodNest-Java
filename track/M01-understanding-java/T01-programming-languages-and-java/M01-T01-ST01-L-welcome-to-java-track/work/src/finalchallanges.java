import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class finalchallanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read student name and scores
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create Student object
        Student student = new Student();

        // Store and print name
        student.setName(name);
        student.showName();

        // Call both overloaded showScore methods
        student.showScore(first);
        student.showScore(first, second);

        scanner.close();
    }
}
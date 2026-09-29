import java.util.Scanner;

class Student {
    int id;
    String name;
    int javaScore;
}

public class compareobjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student firststudent = new Student();
        firststudent.id = scanner.nextInt();
        firststudent.name = scanner.next();
        firststudent.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        Student secondstudent = new Student();
        secondstudent.id = scanner.nextInt();
        secondstudent.name = scanner.next();
        secondstudent.javaScore = scanner.nextInt();

        // Display both records
        System.out.println(firststudent.id + " - " + firststudent.name + " - " + firststudent.javaScore);
        System.out.println(secondstudent.id + " - " + secondstudent.name + " - " + secondstudent.javaScore);

        // Compare Java scores and print result
        if (firststudent.javaScore > secondstudent.javaScore) {
            System.out.println(firststudent.name + " has the higher Java score.");
        } else if (secondstudent.javaScore > firststudent.javaScore) {
            System.out.println(secondstudent.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

class Student {
    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double javaScore;
}

public class studentobject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one Student object
        Student sc = new Student();
        Student sc1 = new Student();

        // Read and store all values in the object
        sc.id = scanner.nextInt();
        sc.name = scanner.next();
        sc.course = scanner.next();
        sc.javaScore = scanner.nextDouble();
        sc1.id = scanner.nextInt();
        sc1.name = scanner.next();
        sc1.course = scanner.next();
        sc1.javaScore = scanner.nextDouble();

        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + sc.id);
        System.out.println("Name: " + sc.name);
        System.out.println("Course: " + sc.course);
        System.out.println("Java Score: " + sc.javaScore);
        System.out.println("Student Profile");
        System.out.println("ID: " + sc1.id);
        System.out.println("Name: " + sc1.name);
        System.out.println("Course: " + sc1.course);
        System.out.println("Java Score: " + sc1.javaScore);
    }
}
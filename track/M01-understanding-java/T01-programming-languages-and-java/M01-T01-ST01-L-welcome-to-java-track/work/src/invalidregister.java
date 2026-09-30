import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class invalidregister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate first student
        Student fs = new Student();
        fs.registrationId = scanner.nextInt();
        fs.name = scanner.next();
        fs.attendancePercentage = scanner.nextDouble();

        // Create and populate second student
        Student ss = new Student();
        ss.registrationId = scanner.nextInt();
        ss.name = scanner.next();
        ss.attendancePercentage = scanner.nextDouble();

        // Read the target search ID and new attendance percentage
        int searchid = scanner.nextInt();
        double newattendance = scanner.nextDouble();

        // Reference variable (no new Student object created)
        Student selectedStudent = null;

        if (searchid == fs.registrationId) {
            selectedStudent = fs;
        } else if (searchid == ss.registrationId) {
            selectedStudent = ss;
        }

        // Update attendance if match is found
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newattendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display output records
        System.out.println(fs.registrationId + " - " + fs.name + " - " + fs.attendancePercentage + "%");
        System.out.println(ss.registrationId + " - " + ss.name + " - " + ss.attendancePercentage + "%");

        scanner.close();
    }
}
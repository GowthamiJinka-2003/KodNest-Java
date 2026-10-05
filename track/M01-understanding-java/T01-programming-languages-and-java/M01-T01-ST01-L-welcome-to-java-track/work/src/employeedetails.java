import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        // Store parameters in instance variables using 'this'
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        // Print the stored name and salary
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class employeedetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read full name and salary
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee();

        // Set details and display them
        employee.setDetails(name, salary);
        employee.displayDetails();

        scanner.close();
    }
}
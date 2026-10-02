import java.util.Scanner;



public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Create object
        Rectangle a = new Rectangle();

        // Call calculateArea()
        int area = a.calculateArea(length, breadth);

        // Print area
        System.out.println("Area: " + area);

        scanner.close();
    }
}
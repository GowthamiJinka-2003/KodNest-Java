import java.util.Scanner;
public class addtwonumberswithparameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        Calculator c = new Calculator();

        // Call add()
        int sum = c.add(first, second);

        // Print returned sum
        System.out.println(sum);

        scanner.close();
    }
}
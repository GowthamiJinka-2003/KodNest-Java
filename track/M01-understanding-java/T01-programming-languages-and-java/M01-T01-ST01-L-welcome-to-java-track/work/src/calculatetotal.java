import java.util.Scanner;

class ResultCalculator {
    // Return the total of two marks
    int getTotal(int first, int second) {
        return first + second;
    }

    // Return the total of three marks
    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class calculatetotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator resultcalculator = new ResultCalculator();

        // Call methods and print totals
        System.out.println("Two-Mark Total: " + resultcalculator.getTotal(first, second));
        System.out.println("Three-Mark Total: " + resultcalculator.getTotal(first, second, third));

        scanner.close();
    }
}

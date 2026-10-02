import java.util.Scanner;

public class returnnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility2 num = new NumberUtility2();

        // Call method
        int result = num.getNextNumber(number);

        // Print result
        System.out.println(result);

        scanner.close();
    }
}

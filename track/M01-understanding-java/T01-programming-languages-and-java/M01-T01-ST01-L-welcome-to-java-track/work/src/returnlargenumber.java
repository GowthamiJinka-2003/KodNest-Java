import java.util.Scanner;

public class returnlargenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        NumberUtility3 f = new NumberUtility3();

        // Call method
        int result = f.getLarger(first, second);

        // Print result
        System.out.println(result);

        scanner.close();
    }
}

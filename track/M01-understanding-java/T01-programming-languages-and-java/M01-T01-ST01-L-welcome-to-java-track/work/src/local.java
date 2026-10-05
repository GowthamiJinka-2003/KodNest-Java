import java.util.Scanner;

class Result {
    void show(int mark) {
        // Declare message before the if-else block so it is accessible throughout the method
        String message;

        if (mark >= 60) {
            // Assign "Eligible" if mark is 60 or higher
            message = "Eligible";
        } else {
            // Assign "Keep Practising" otherwise
            message = "Keep Practising";
        }

        // Print the result message
        System.out.println(message);
    }
}

public class local {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        Result result = new Result();
        result.show(mark);

        scanner.close();
    }
}

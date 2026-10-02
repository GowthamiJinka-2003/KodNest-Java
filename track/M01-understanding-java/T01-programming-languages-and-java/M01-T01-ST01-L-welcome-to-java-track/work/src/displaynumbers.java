import java.util.Scanner;

public class displaynumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        // Create object
        StudentUtility utility = new StudentUtility();

        // Call displayName()
        utility.displayName(name);

        scanner.close();
    }
}

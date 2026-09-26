import java.util.Scanner;

public class fullnameandage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();
        String fullName = scanner.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);

        scanner.close();
    }
}
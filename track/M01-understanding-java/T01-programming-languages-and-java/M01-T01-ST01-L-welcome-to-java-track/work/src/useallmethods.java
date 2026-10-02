import java.util.Scanner;

public class useallmethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodPractice practice = new MethodPractice();

        practice.showTitle();
        practice.showName(name);

        int passingMark = practice.getPassingMark();
        int total = practice.calculateTotal(first, second);

        System.out.println("Passing Mark: " + passingMark);
        System.out.println("Total: " + total);

        scanner.close();
    }
}
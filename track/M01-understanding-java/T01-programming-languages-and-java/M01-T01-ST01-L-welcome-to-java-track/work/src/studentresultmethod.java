import java.util.Scanner;

public class studentresultmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        StudentResult result = new StudentResult();

        result.showTitle();
        result.displayName(name);

        int passingMark = result.getPassingMark();
        int average = result.calculateAverage(first, second);

        System.out.println("Passing Mark: " + passingMark);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

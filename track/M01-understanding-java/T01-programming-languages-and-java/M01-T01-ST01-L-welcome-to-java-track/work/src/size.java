import java.util.Scanner;
public class size {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int sum = 0;
    int[] numbers = new int[size];
    for (int i = 0; i <= numbers.length - 1; i++) {
    numbers[i] = scanner.nextInt();
    }
    for (int i = 0;i <= numbers.length - 1; i++) {
    sum += numbers[i];
    }
    System.out.println(sum);

    }
}

import java.util.Scanner;
public class numbertomethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        NumberUtility1 num = new NumberUtility1();

        int res = num.getValue(number);

        System.out.println(res);

        scanner.close();
    }
}

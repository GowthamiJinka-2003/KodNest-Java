import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class profileobject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner fl = new Learner();
        fl.id = scanner.nextInt();
        fl.name = scanner.next();
        fl.javaScore = scanner.nextInt();

        // Create and populate the second Learner object
        Learner sl = new Learner();
        sl.id = scanner.nextInt();
        sl.name = scanner.next();
        sl.javaScore = scanner.nextInt();

        // Read the updated Java score for the first learner
        int newFirstScore = scanner.nextInt();

        // Print details before update
        System.out.println("Before Update");
        System.out.println(fl.id + " - " + fl.name + " - " + fl.javaScore);
        System.out.println(sl.id + " - " + sl.name + " - " + sl.javaScore);

        // Update the first learner's score
        fl.javaScore = newFirstScore;

        // Print details after update
        System.out.println("After Update");
        System.out.println(fl.id + " - " + fl.name + " - " + fl.javaScore);
        System.out.println(sl.id + " - " + sl.name + " - " + sl.javaScore);
    }
}
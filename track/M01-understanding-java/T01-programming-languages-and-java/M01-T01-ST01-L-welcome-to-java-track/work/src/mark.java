public class mark {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;
        if (marks >= 60 && attendance >= 75) {
            System.out.println("Placement Ready");
        for (int i = 1; i <= 3; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Practice Day: " + i);
        }
    }        
    }
}
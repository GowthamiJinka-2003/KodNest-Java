public class muk {
    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean ProjectCompleted = true;
        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligible = marksEligible && attendanceEligible;
        boolean placementEligible = academicEligible && ProjectCompleted;
        System.out.println("Placement Eligible:" + placementEligible);
    }
    
}

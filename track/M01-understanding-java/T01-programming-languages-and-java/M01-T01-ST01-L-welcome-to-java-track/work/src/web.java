public class web {
    public static void main(String[] args) {
        double Principal = 10000;
        double Rate = 6.5;
        double Time = 2.0;
        double Weight = 72.0;
        double Height = 1.8;
        int java = 78;
        int sql  = 85;
        int aptitude = 69;
        int communication = 91;
        int web = 88;
        int TotalMarks = java + sql + aptitude + communication + web;
        double SimpleInterest = Principal * Rate * Time / 100;
        double TotalAmount = Principal + SimpleInterest;
        double BMI = Weight / (Height * Height);
        double Percentage = TotalMarks * 100 / 500;
        System.out.println("Simple Interest: " + SimpleInterest);
        System.out.println("Total Amount: " + TotalAmount);
        System.out.println("BMI: " + BMI);
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Percentage: " +Percentage);       
}
    
}

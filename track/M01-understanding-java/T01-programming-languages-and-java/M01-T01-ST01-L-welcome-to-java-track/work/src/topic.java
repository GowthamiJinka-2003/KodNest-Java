public class topic {
    public static void main(String[] args) {
        int CompletedTopics = 17;
        int TotalTopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;
        int RemainingTopics = TotalTopics - CompletedTopics;
        int Weeklylearninghours = Learningdays * Dailylearninghours;
        double ProgressPercentage = CompletedTopics * 100.0 / TotalTopics;
        System.out.println("Completed Topics: " + CompletedTopics);
        System.out.println("Remaining Topics: " + RemainingTopics);
        System.out.println("Weekly Learning Hours: " + Weeklylearninghours);
        System.out.println("progress Percentage: " + ProgressPercentage);
    }
    
}

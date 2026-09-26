import java.util.Scanner;
public class interactivelearner{   
public static void main(String[] args) {    
Scanner scan = new Scanner(System.in);  
String firstName = scan.next();   
int solvedProblems = scan.nextInt(); 
double assesmentPercentage = scan.nextDouble(); 
System.out.println("Learner: " + firstName);  
System.out.println("Problems solved: " + solvedProblems);  
System.out.println("Assessment: " + assesmentPercentage);  
scan.close();   
}
}
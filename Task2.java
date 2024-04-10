//TASK NO. 2 Student grade calculator
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//taking input from user for subjects number
        System.out.print("Enter the number of subjects: ");
        int Subject = scanner.nextInt();
        int tMarks = 0;
        for (int i = 1; i <= Subject; i++) {
//taking input from user for subjects             
            System.out.print("Enter marks in subjects " + i + ": ");
            int marks = scanner.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println("Subjects Marks should be between 0 and 100");
                marks = scanner.nextInt();
            }
//sum of the subjects marks            
            tMarks=tMarks+marks;
        }
//Average of the subjects marks 
        double avgPercentage= (double) tMarks /Subject;
//Grade of the subjects marks 
        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else if (avgPercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + tMarks);
        System.out.println("Average Percentage: " + avgPercentage);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
package ProgrammingChallenge;
import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        char grade = (score >=90)? 'A': (score >=80)? 'B': (score >=70)? 'C': (score >=60)? 'D': 'F';
        System.out.println("The grade for a score of " + score + " is: " +grade);
        scanner.close();
    }
}

package ProgrammingChallenge;
import java.util.Scanner;

public class NumToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, etc., up to 7): ");
        int day = scanner.nextInt();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println((day >= 1 && day <= 7) ? days[day - 1] : "Invalid number. Please enter a number between 1 and 7.");
        scanner.close();
    }
}

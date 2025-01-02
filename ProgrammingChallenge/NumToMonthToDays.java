package ProgrammingChallenge;
import java.util.Scanner;

public class NumToMonthToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1 for January, 2 for February, etc.): ");
        int month = scanner.nextInt();

        int days = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                yield -1;
            }
        };
        if (days != -1) {
            System.out.println("The number of days in month " + month + " is: " + days);
        }
        scanner.close();
    }
}


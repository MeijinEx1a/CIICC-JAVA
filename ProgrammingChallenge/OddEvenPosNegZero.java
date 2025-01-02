package ProgrammingChallenge;
import java.util.Scanner;

public class OddEvenPosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String oddEven = (number % 2 == 0) ? "even" : "odd"; 
        String posNegZero = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("The number " + number +" is " + oddEven + " and " + posNegZero + ".");
        scanner.close();
    }
}

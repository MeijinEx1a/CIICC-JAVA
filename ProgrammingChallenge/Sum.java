package ProgrammingChallenge;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number=1;

        System.out.print("Enter the total amount of numbers you wish to compute (up to 10 numbers can be computed): ");
        if (scanner.hasNextInt()) {
            int totalnumber = scanner.nextInt();
            for(int i = 0; i<totalnumber;i++){
                System.out.print("Enter number "+ number + ": ");
                sum += scanner.nextInt();
                number++;
            } 
        }else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        System.out.println("The sum of all numbers are: " +sum);
        scanner.close();
    }
}

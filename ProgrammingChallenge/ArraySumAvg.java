package ProgrammingChallenge;

import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0;
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; sum += scanner.nextInt(), i++);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (double) sum / n);
        } else {
            System.out.println("Invalid array size. Please enter a positive number.");
        }

        scanner.close();
    }
}

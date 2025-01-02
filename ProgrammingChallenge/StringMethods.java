package ProgrammingChallenge;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to be checked: ");
        String input = scanner.nextLine();
        if(input.isEmpty()){
            System.out.println("String is empty!");
        }else{
            System.out.println("Length of string: " + input.length());
            System.out.println("Uppercase: " + input.toUpperCase());
            System.out.println("Lowercase: " + input.toLowerCase());
            System.out.println("First char: " + (input.charAt(0)));
            System.out.println("Last char: " + (input.charAt(input.length() - 1)));
            System.out.println("Substring (2nd to 5th): " + (input.length() >= 5 ? input.substring(1, 5) : "String is too short."));
        }
        scanner.close();
    }
}

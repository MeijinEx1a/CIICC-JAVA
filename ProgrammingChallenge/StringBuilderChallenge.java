package ProgrammingChallenge;
//import ProgrammingChallenge.StringMethods;
import java.util.Scanner;


class StringBuilderChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string (String must be at least 10 characters.):  ");
        String input = scanner.nextLine();
        if (input.isEmpty() || input.length() < 10) {
            System.out.println("Invalid input! Please enter a string with at least 10 characters.");
        }else{
            StringBuilder sb = new StringBuilder(input);
            System.out.println("1. Length of string: " + sb.length());
            System.out.println("2. First Character: " + sb.charAt(0));
            System.out.println("3. Last Character: " + sb.charAt(sb.length()-1));
            System.out.println("4. Index of first occurence of the letter 'a': "+ (sb.indexOf("a") != -1 ? sb.indexOf("a") : "The letter 'a' is not present in the string."));
            System.out.println("5. Substring of the string from index 3 to index 6: " + sb.substring(3, 6));
            System.out.println("6. Append '123' to the end of the string: " + sb.append("123"));
            System.out.println("7. Insert string 'xyz' at index 4: " + sb.insert(4, "xyz"));
            System.out.println("8. Delete substring from index 2 to index 4: " + sb.delete(2, 4));
            System.out.println("9. Delete character at index 8: " + sb.deleteCharAt(8));
            System.out.println("10. String in reverse: " + sb.reverse());

        }
        scanner.close();
    }
}
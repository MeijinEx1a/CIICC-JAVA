import java.util.Scanner;

public class Task119 {
    public static double add (double n1, double n2){
        return n1+n2; 
    }
    
    public static double sub (double n1, double n2){
        return n1-n2; 
    }
    
    public static double mul (double n1, double n2){
        return n1*n2; 
    }
    
    public static double div (double n1, double n2){
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return n1/n2; 
    }


    public static void main(String[] args) {
        double num1,num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1=scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        num2=scanner.nextDouble();


        System.out.println("\nResults:");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + sub(num1, num2));
        System.out.println("Multiplication: " + mul(num1, num2));

        try {
            System.out.println("Division: " + div(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Division: " + e.getMessage());
        }

        scanner.close();
    }    
}


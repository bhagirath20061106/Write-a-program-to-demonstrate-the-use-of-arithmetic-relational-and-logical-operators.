package bhagirath;

import java.util.Scanner;

public class Oprational{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));        
        System.out.println("\nRelational Operations:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        boolean condition1 = (a > 0);
        boolean condition2 = (b > 0);
        System.out.println("\nLogical Operations:");
        System.out.println("Condition1 AND Condition2: " + (condition1 && condition2));
        System.out.println("Condition1 OR Condition2: " + (condition1 || condition2));
        
        scanner.close();
    }
}

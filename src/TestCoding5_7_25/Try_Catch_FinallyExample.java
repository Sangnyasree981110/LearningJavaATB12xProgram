package TestCoding5_7_25;

import java.util.Scanner;

public class Try_Catch_FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write numerator ");
        int numerator = sc.nextInt();
        System.out.println("Write denominator ");
        int denominator = sc.nextInt();

        int result = 0;

        try {
            result = numerator / denominator;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Division operation completed.");
        }
    }
}

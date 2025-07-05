package TestCoding5_7_25;

public class Catch_Multiple_Exceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};

            // This will throw ArithmeticException (division by zero)
            int result = numbers[1] / 0;

            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}

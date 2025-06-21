package TestCoding;

public class AllOperator {
    public static void main(String[] args) {

        // 1. Arithmetic Operators

        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Unary Operators

        int c = 10;
        System.out.println("++c (prefix increment) = " + (++c));
        System.out.println("c++ (postfix increment) = " + (c++));
        System.out.println("c after postfix increment = " + c);
        System.out.println("--c (prefix decrement) = " + (--c));
        System.out.println("c-- (postfix decrement) = " + (c--));
        System.out.println("c after postfix decrement = " + c);
        boolean flag = true;
        System.out.println("!flag = " + (!flag)); // Logical NOT

        // 3. Relational Operators

        int x = 20, y = 15;
        System.out.println("x == y : " + (x == y)); // Equal to
        System.out.println("x != y : " + (x != y)); // Not equal to
        System.out.println("x > y : " + (x > y));   // Greater than
        System.out.println("x < y : " + (x < y));   // Less than
        System.out.println("x >= y : " + (x >= y)); // Greater than or equal to
        System.out.println("x <= y : " + (x <= y)); // Less than or equal to

        // 4. Logical Operators

        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2 : " + (cond1 && cond2)); // Logical AND
        System.out.println("cond1 || cond2 : " + (cond1 || cond2)); // Logical OR
        System.out.println("!cond1 : " + (!cond1));                 // Logical NOT

        // 5. Assignment Operators

        int result = 50;
        System.out.println("Initial result = " + result);
        result += 10; // result = result + 10
        System.out.println("result after += 10 : " + result);
        result -= 5;  // result = result - 5
        System.out.println("result after -= 5 : " + result);
        result *= 2;  // result = result * 2
        System.out.println("result after *= 2 : " + result);
        result /= 4;  // result = result / 4
        System.out.println("result after /= 4 : " + result);
        result %= 3;  // result = result % 3
        System.out.println("result after %= 3 : " + result);

        // 6. Bitwise Operators (for integers)

        int num1 = 6; // Binary: 0110
        int num2 = 3; // Binary: 0011
        System.out.println("num1 & num2 (AND) : " + (num1 & num2)); // 0010 (2)
        System.out.println("num1 | num2 (OR) : " + (num1 | num2));  // 0111 (7)
        System.out.println("num1 ^ num2 (XOR) : " + (num1 ^ num2)); // 0101 (5)
        System.out.println("~num1 (NOT) : " + (~num1));           // Inverts bits (e.g., -7 for 6)
        System.out.println("num1 << 1 (Left Shift) : " + (num1 << 1)); // 1100 (12)
        System.out.println("num1 >> 1 (Right Shift) : " + (num1 >> 1)); // 0011 (3)
        System.out.println("num1 >>> 1 (Zero Fill Right Shift) : " + (num1 >>> 1)); // 0011 (3)

        // 7. Ternary Operator (Conditional Operator)

        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status based on age: " + status);
    }
}

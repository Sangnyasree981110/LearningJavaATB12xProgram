package Task;

import java.util.Scanner;

public class ReverseString_Using_forLoop {
    public static void main(String[] args) {
       // String inputString = "Hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String inputString = sc.next();

        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.println(reverse);

    }

}



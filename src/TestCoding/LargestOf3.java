package TestCoding;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a>b) && (a>c))
        {
            System.out.println("Largest a");
        } else if ((b>a) && (b>c)) {
            System.out.println("Largest b");
        }
        else {
            System.out.println("Largest c");
        }
    }
}

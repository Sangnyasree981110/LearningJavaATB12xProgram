package Task;

public class ReverseString_Check_Pallindrome {
    public static void main(String[] args) {
        String inputString = "naman";
        System.out.println(inputString);

        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.println(reverse);

        if (inputString.equals(reverse)) {
            System.out.println(inputString + " is a Palindrome number.");
        } else {
            System.out.println(inputString + " is not a Palindrome number.");
        }
    }
}
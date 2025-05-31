package Task;

public class ReverseString_Using_fun {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        System.out.println("Original string: " + originalString);

        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Reverse the string using the reverse() method
        stringBuffer.reverse();

        // Convert the reversed StringBuffer back to a String
       // String reversedString = stringBuffer.toString();
        System.out.println("Reversed string: " + stringBuffer);
    }
}


package TestCoding;

public class TypeCasting {

    public static void main(String[] args) {


        int intValue = 10;
        long longValue = intValue; // int to long implicit


        System.out.println("Original int value: " + intValue);
        System.out.println("Implicitly casted long value: " + longValue);

        double largeDouble = 123.45;
        int castedInt = (int) largeDouble; // double to int
        System.out.println("Original double value: " + largeDouble);
        System.out.println("Explicitly casted int value (truncation): " + castedInt);

    }
}

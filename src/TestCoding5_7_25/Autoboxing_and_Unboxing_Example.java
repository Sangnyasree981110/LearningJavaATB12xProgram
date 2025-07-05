package TestCoding5_7_25;

public class Autoboxing_and_Unboxing_Example {
    public static void main(String[] args) {
        // Autoboxing: primitive int automatically converted to Integer object
        Integer obj = 10;

        // Unboxing: Integer object automatically converted to primitive int
        int num = obj;

        System.out.println("Integer object: " + obj);
        System.out.println("Primitive int: " + num);
    }
}

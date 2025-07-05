package TestCoding5_7_25;

public class Wrapper_Class_FindMaxValue {
    public static void main(String[] args) {
       Integer[] numbers={10, 20, 5, 30, 15, 17};

       int max = numbers[0];

        for(int i =0; i < numbers.length; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        System.out.println("Max number " + max);
    }
}

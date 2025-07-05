package TestCoding5_7_25;

public class Generic_Swap_Method {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};

        // Swap elements at index 0 and 2
        Integer temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        // Print array after swap
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

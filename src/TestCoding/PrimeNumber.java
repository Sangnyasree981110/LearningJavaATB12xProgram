package TestCoding;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // Assume the current number is prime initially


            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { // If 'i' is divisible by 'j', it's not prime
                    isPrime = false;
                    break;

                }
            }

            // If isPrime is still true, the number is prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

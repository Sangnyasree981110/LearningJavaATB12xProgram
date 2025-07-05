package TestCoding5_7_25;

public class GenericClass_for_Pair<T, U>{
    // Step 1: Define a generic Pair class
        T first;
        U second;

        // Constructor to initialize the pair
        GenericClass_for_Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        // Method to display the pair values
        void display() {
            System.out.println("First: " + first + ", Second: " + second);
        }
    }

    // Step 2: Use the Pair class in main
 class Main {
        public static void main(String[] args) {
            // Create a Pair with String and Integer
            GenericClass_for_Pair<String, Integer> pair = new GenericClass_for_Pair<>("Test", 100);

            // Call the display method to show the values
            pair.display();
        }
    }

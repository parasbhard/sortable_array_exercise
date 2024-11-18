
import java.util.Arrays;

public class SortableArray {
    // Method to sort an array of integers
    public static void sortIntegers(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted integers: " + Arrays.toString(arr));
    }

    // Method to sort an array of strings
    public static void sortStrings(String[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted strings: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] intArray = {5, 3, 8, 1, 2};
        // Example array of strings
        String[] stringArray = {"apple", "orange", "banana", "grape"};

        // Calling methods to sort and display the arrays
        System.out.println("Before sorting:");
        System.out.println("Integers: " + Arrays.toString(intArray));
        System.out.println("Strings: " + Arrays.toString(stringArray));

        System.out.println("\nAfter sorting:");
        sortIntegers(intArray); // Sort and print integers
        sortStrings(stringArray); // Sort and print strings
    }
}

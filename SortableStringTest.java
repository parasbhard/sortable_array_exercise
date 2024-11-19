import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class SortableArrayTest {

    @Test
    public void testSortStrings() {
        // Input array of strings
        String[] input = {"banana", "apple", "grape", "orange"};
        // Expected sorted array
        String[] expected = {"apple", "banana", "grape", "orange"};

        // Call the sortStrings method
        SortableArray.sortStrings(input);

        // Verify that the input array is sorted as expected
        assertArrayEquals("The strings should be sorted alphabetically", expected, input);
    }
}

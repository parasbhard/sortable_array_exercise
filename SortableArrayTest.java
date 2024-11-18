import org.junit.Test;
import static org.junit.Assert.*;

public class SortableArrayTest {
    @Test
    public void testSortIntegers() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        SortableArray.sortIntegers(input);
        assertArrayEquals(expected, input);
    }
}

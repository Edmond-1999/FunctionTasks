package sortedSquaredArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedSquaredArrayTest {
    @Test
    public void testThatIHaveAnArray_ISquareIt_ISortIt_AndItGivesMeTheCorrectValues() {
        SortedSquaredArray sortedSquaredArray = new SortedSquaredArray();

        int[] numbers = {-3, 2, -7, 1, 4};

        int[] expected = {1, 4, 9, 16, 49};
        int[] actual = sortedSquaredArray.sortedSquaredArray(numbers);

        assertArrayEquals(expected, actual);
    }

}

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test
    public void testSortedArray () {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12, 6};
        int[] expectedResult = {2, 3, 4, 4, 5, 6, 7, 9, 12, 12};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray () {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOneElementArray () {
        int[] array = {4};
        int[] expectedResult = {4};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}


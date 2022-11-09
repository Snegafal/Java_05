import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    @Test
    public void testSortedArray() {
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 2;

        int actualResult = new KthLargest().getRthLargestElementOfArray(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthGreaterArrayLenght() {
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 73;
        int expectedResult = 0;

        int actualResult = new KthLargest().getRthLargestElementOfArray(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthEqualsArrayLenght() {
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 9;
        int expectedResult = 2;

        int actualResult = new KthLargest().getRthLargestElementOfArray(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray_Negative () {
        int[] array = {};
        int k = 0;
        int expectedResult = 0;

        int actualResult = new KthLargest().getRthLargestElementOfArray(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthIsNegativeArray () {
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = -3;
        int expectedResult = 0;

        int actualResult = new KthLargest().getRthLargestElementOfArray(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
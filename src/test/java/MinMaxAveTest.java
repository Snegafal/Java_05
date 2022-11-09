import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAveArrayOfTwoGivenIndices_HappyPath () {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = new MinMaxAve().
                createArrayMinMaxAveofAnotherArrayGivenIndices(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstIndexIsGreater_Happy_Path () {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        int[] expectedResult = {7, 3, 5};

        int[] actualResult = new MinMaxAve().
                createArrayMinMaxAveofAnotherArrayGivenIndices(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEqualGivenIndices_Happy_path () {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;
        int[] expectedResult = {3, 3, 3};

        int[] actualResult = new MinMaxAve().
                createArrayMinMaxAveofAnotherArrayGivenIndices(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEqualGivenIndicesAndOneElementArray_Negative () {
        int[] array = {3};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().
                createArrayMinMaxAveofAnotherArrayGivenIndices(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOneElementArray_Negative () {
        int[] array = {4};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().
                createArrayMinMaxAveofAnotherArrayGivenIndices(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGivenIndicesOutOfRange_Negative () {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 29;
        int index2 = 61;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().
                createArrayMinMaxAveofAnotherArrayGivenIndices(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

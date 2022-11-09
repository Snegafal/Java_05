import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test
    public void testZeroIndexGreaterThanFirst () {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZeroIndexLowerThanFirst () {
        int[] array = {0, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {7, 23};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLastIndexGreaterThanLastButOne () {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 100};
        int[] expectedResult = {3, 7, 100};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLastIndexLowerThanLastButOne () {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoElementsArray () {
        int[] array = {3, 0};
        int[] expectedResult = {3};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray () {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOneElementArray () {
        int[] array = {8};
        int[] expectedResult = {};

        int[] actualResult = new PeakElement().getPeakElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}

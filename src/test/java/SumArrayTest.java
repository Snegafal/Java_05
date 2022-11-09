import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testSumOfArrayWithPositiveNumbers_HappyPath () {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumOfNumbersInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfArrayWithNegativeNumbers_HappyPath () {
        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumOfNumbersInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfEmptyArray_Negative () {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().sumOfNumbersInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void testReversedArray_HappyPath () {
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {1, 3, 7, 2};

        int[] actualResult = new ReverseArray().makeArrayReversed(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray_HappyPath () {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new ReverseArray().makeArrayReversed(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void testArrayIndicesOfEvenLenghtArray () {
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndicesInArray(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIndicesOfOddLenghtArray () {
        int[] input = {-45, 590, 234, 985, 12};
        int[] expectedResult = {590, 985};

        int[] actualResult = new OddIndices().oddIndicesInArray(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray_Negative () {
        int[] input = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndicesInArray(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOneElementArray () {
        int[] input = {23};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndicesInArray(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

}



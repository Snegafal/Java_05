import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeNumbersOnTheRight () {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        int[] actualResult = new NegativeOnTheRight().getNegativeOnTheRightArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOnlyPositiveNumbers () {
        int[] array = {1, 13, 56};
        int[] expectedResult = {1, 13, 56};

        int[] actualResult = new NegativeOnTheRight().getNegativeOnTheRightArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOnlyNegativeNumbers () {
        int[] array = {-1, -13, -56};
        int[] expectedResult = {-1, -13, -56};

        int[] actualResult = new NegativeOnTheRight().getNegativeOnTheRightArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}

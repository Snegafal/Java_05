import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testNumberIsPositive () {
        int number = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNumberIsZero () {
        int number = 0;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNumberIsNegative () {
        int number = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

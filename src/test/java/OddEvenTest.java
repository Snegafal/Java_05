import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testOddNumber () {
        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddOrEvenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEvenNumber () {
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddOrEvenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZero () {
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddOrEvenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void testFirstNumberIsLower () {
        int number1 = 3333;
        int number2 = 9999;

        int expectedResult = number2;

        int actualResult = new BiggerValue().getBiggerValueOutOfTwoNumbers(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSecondNumberIsLower () {
        int number1 = 3333;
        int number2 = 1111;

        int expectedResult = number1;

        int actualResult = new BiggerValue().getBiggerValueOutOfTwoNumbers(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEqualNumbers () {
        int number1 = 9999;
        int number2 = 9999;

        int expectedResult = number2;

        int actualResult = new BiggerValue().getBiggerValueOutOfTwoNumbers(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

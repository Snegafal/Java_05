import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CreateArrayTest {
    @Test
    public void testCreateIntArray () {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new CreateArray().createIntArray
                (number1, number2, number3, number4, number5);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArray () {
        double number1 = 1.1;
        double number2 = 2.5;
        double number3 = 3.7;
        double number4 = 4.0;
        double number5 = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        double[] actualResult = new CreateArray().createDoubleArray
                (number1, number2, number3, number4, number5);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateStringArray () {
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText () {
        String sentence = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void createIntArrayFromTextWithDouble () {
        String text = "3 4 1 8 10 12.3";
        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        int[] actualResult = new  CreateArray().createIntArrayFromText(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void createEmptyArrayFromEmptyString_Negative () {
        String text = " ";
        int[] expectedResult = {};

        int[] actualResult = new  CreateArray().createIntArrayFromText(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void createEmptyArrayStringWithText_Negative () {
        String text = "2 565 gfg";
        int[] expectedResult = {2, 565};

        int[] actualResult = new  CreateArray().createIntArrayFromText(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countOddValuesInArray () {
        int[] array = {2, 565, 676, 34, 909090, 343};
        int[] expectedResult = {4, 2};

        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countOddValuesInEmptyArray () {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void createOddValuesTwoDimArray () {
        int[] array = {2, 565, 676, 34, 909090, 343};
        int[][] expectedResult = {{2, 676, 34, 909090}, {565, 343}};

        int[][] actualResult = new OddEvenValuesInArray().createOddEvenArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void createMultipleOfNumberArray () {
        int number = 2;
        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[]actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void createEmptyArrayWithNumberOutOfRangeOneToTen () {
        int number = 28;
        int[] expectedResult = {};

        int[]actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

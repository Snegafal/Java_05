import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {
    //    Написать метод countEvenValuesInArray(), который принимает на
//    вход массив целых чисел, и возвращает количество четных чисел в этом массиве

    @Test
    public void testCountEvenNumbersInArray () {
        int[] array = {1, -2, 0, 4, -5};
        int expectedResult = 3;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenNumbersInEmptyArray () {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddNumbersInArray () {
        int[] array = {1, -2, 0, 4, -5};
        int expectedResult = 2;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddNumbersInEmptyArray () {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

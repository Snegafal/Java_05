import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testMultiplуArrayByPositiveNumber () {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplуArrayByNegativeNumber () {
        int[] array = {1, 2, 3, 4, 5};
        int number = -3;
        int[] expectedResult = {-3, -6, -9, -12, -15};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplуArrayByZero () {
        int[] array = {1, 2, 3, 4, 5};
        int number = 0;
        int[] expectedResult = {0, 0, 0, 0, 0};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplуEmptyArrayByNumber_Negative () {
        int[] array = {};
        int number = 3;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplуArrayByTooGreatNumber () {
        int[] array = {1, 290909909, 3, 4, 5};
        int number = 389889898;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //    Написать метод toDoubleArray(), который принимает на вход
//    массив целых чисел,  и возвращает массив типа double[] из тех же чисел
//    Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

    @Test
    public void testToDoubleArrayWithPositiveNumbers () {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArrayWithNegativeNumbers () {
        int[] array = {1, -2, 3, -4, 5};
        double[] expectedResult = {1.0, -2.0, 3.0, -4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleEmptyArray () {
        int[] array = {};
        double[] expectedResult = {};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    Написать метод toIntArray(), который принимает на вход массив
//    типа double[],  и возвращает массив типа int[] из тех же чисел
//    Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

    @Test
    public void testToIntArrayWithPositiveNumbers () {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArrayWithNegativeNumbers () {
        double[] array = {1.0, 2.0, -3.0, 4.0, -5.0};
        int[] expectedResult = {1, 2, -3, 4, -5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntEmptyArray_Negative () {
        double[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //    Написать метод toStringArray(), который принимает на вход массив
//    целых чисел, и возвращает массив типа String[] из тех же чисел
//    (желательно не использовать метод .toString(), нужно переводить вручную)
//    Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}

    @Test
    public void testToStringArray () {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringEmptyArray_Negative () {
        int[] array = {};
        String[] expectedResult = {};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}

    @Test
    public void testDoubleArrayToString () {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    написать метод areValuesGreaterThanNumber(), который принимает
//    на вход массив целых чисел и число number. Метод возвращает
//    значение true, если все элементы массива больше number,
//    иначе возвращает false

    @Test
    public void testAllElementsAreGreater () {
        int[] array = {1, 2, 3, 4, 5};
        int number = -20;
        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().
                areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
}

    @Test
    public void testAllElementsAreLower () {
        int[] array = {1, 2, 3, 4, 5};
        int number = 12;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().
                areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSomeElementsAreGreater () {
        int[] array = {1, 2, 3, 4, 5};
        int number = 2;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().
                areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {


    @Test
    public void testGetIntersectionsInPositiveNumbersArray_HappyPath () {
        int[] array1 = {1, 2, 4, 5, 89, 4};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        int[] actualResult = new Intersection().getIntersectionInTwoArrays(array1, array2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetIntersectionsInNegaitiveNumbersArray_HappyPath () {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        int[] actualResult = new Intersection().getIntersectionInTwoArrays(array1, array2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetNoIntersection() {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {-8, -9, -4, -2};
        int[] expectedResult = {};

        int[] actualResult = new Intersection().getIntersectionInTwoArrays(array1, array2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoIntersectionsWhenOneArrayIsEmpty() {
        int[] array1 = {};
        int[] array2 = {-8, -9, -4, -2};
        int[] expectedResult = {};

        int[] actualResult = new Intersection().getIntersectionInTwoArrays(array1, array2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

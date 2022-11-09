import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleSevenNineElevenNumberTest {

    @Test
    public void testMultipleSevenAndNineNumber () {
        int number = 693;
        String expectedResult = "Good Number";

        String actualResult = new MultipleSevenNineElevenNumber()
                .findOutMultipleSevenNineElevenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultipleNineAndNotMultipleSevenNumber () {
        int number = 9;
        String expectedResult = "Bad Number";

        String actualResult = new MultipleSevenNineElevenNumber()
                .findOutMultipleSevenNineElevenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultipleElevenAndNotMultipleSevenAndNineNumber () {
        int number = 121;
        String expectedResult = "Poor Number";

        String actualResult = new MultipleSevenNineElevenNumber()
                .findOutMultipleSevenNineElevenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNotMultipleElevenSevenAndNineNumber () {
        int number = 12;
        String expectedResult = "-1";

        String actualResult = new MultipleSevenNineElevenNumber()
                .findOutMultipleSevenNineElevenNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }



}

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void testCheckEmptyString_Negative () {
        String str = "";
        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckNoAdditionalSpacesString () {
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckManySpacesString () {
        String str = "    Red Rover School    ";
        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckManySpacesStringNoAs () {
        String str = "    Red Rover School    ";
        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckEmptyStringNoAs_Negative () {
        String str = " ";
        String expectedResult = "";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckManySpacesStringAndAs () {
        String str = "panda   ";
        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckNoSpacesStringAndWithAs () {
        String str = "taramasalata";
        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    “3504209706040000 “ →  “35429764“
//            “0000000111“ → “111”

    @Test
    public void testCheckStringWithSpacesAndZeros () {
        String str = "3504209706040000 ";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckStringWithNoSpacesAndZeros () {
        String str = "3504209706040000";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckStringWithNoZeros () {
        String str = "126768986";
        String expectedResult = "This is a valid string";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckStringWithSpacesAndNoZeros () {
        String str = "   126768986   ";
        String expectedResult = "126768986";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckEmptyStringZeros () {
        String str = "   ";
        String expectedResult = "";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckStringWithTooManySpaces () {
        String str = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckStringWithTooManySpaces2 () {
        String str = "p a     n   d a   ";
        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckEmptyStringSpaces () {
        String str = "   ";
        String expectedResult = "";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckAasInString () {
        String str = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckNoAasInString () {
        String str = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckWithAasSpacesNumbersInString () {
        String str = "3 tarAmasAlatA      ";
        String expectedResult = "6, 14";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckSpacesStringNoAas () {
        String str = "   ";
        String expectedResult = "0, 3";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckEmptyStringNoAas () {
        String str = "";
        String expectedResult = "";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testJavaWordInString () {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although " +
                "it will otherwise still support Java 8 with public updates for " +
                "personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoJavaWordInString () {
        String str = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMakeTextQuoted () {
        String str = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMakeTextQuotedWithoutManySpaces () {
        String str = "    Abracadabra     ";
        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMakeTextQuotedAfterWrote () {
        String str1 = "Федор Достоевский писал";
        String str2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал: " +
                "\"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWroteIsMisspelled () {
        String str1 = "Федор Достоевский писа";
        String str2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "";

        String actualResult = new StringMethods().insertQuotes(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMakeTextQuotedAfterWroteWithSpaces () {
        String str1 = "   Федор Достоевский писал    ";
        String str2 = "Надо любить жизнь больше, чем смысл жизни.    ";
        String expectedResult = "Федор Достоевский писал: " +
                "\"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReWriteCityNameStartsWithLowerCase () {
        String city = "ташкент";
        String expectedResult = "Ташкент";

        String actualResult = new StringMethods().reWriteCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReWriteCityNameStartsWithUpperCaseAndOtherUpperCaseLetters () {
        String city = "ЧикаГО";
        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().reWriteCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReWriteCityNameStartsWithLowerCaseAndOtherUpperCaseLettersAndSpaces () {
        String city = "   чикаГО    ";
        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().reWriteCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetextBetweenFirstAndLastParameter () {
        String text = "Abracadabra";
        String letter = "b";
        String expectedResult = "bracadab";

        String actualResult = new StringMethods()
                .getTextBetweenFirstAndLastParameter(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetextBetweenFirstAndLastParameterWithManyParameter () {
        String text = "Whippersnapper";
        String letter = "p";
        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods()
                .getTextBetweenFirstAndLastParameter(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckIsAnagramFirstLetterIsUpperCase () {
        String str = "Abracadabra";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().isWordAnagram(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckIsNotAnagram () {
        String str = "Whippersnapper";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().isWordAnagram(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPrintSecondWordOutOfTwo () {
        String str = "Red Rover";
        String expectedResult = "Rover";

        String actualResult = new StringMethods().getSecondWordOutOfTwo(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPrintSecondWordOutOfTwoWithManySpaces () {
        String str = "   Red Rover    ";
        String expectedResult = "Rover";

        String actualResult = new StringMethods().getSecondWordOutOfTwo(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPrintTextBetweenIndeces () {
        String str = "Red rover";
        int startIndex = 1;
        int endIndex = 4;
        String expectedResult = "Rover";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBothIndecesOutOfRange_Negative () {
        String str = "Red rover";
        int startIndex = 9;
        int endIndex = 18;
        String expectedResult = "";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstIndexOutOfRange_Negative () {
        String str = "Red rover";
        int startIndex = 99;
        int endIndex = 1;
        String expectedResult = "";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSecondIndexOutOfRange_Negative () {
        String str = "Red rover";
        int startIndex = 7;
        int endIndex = 17;
        String expectedResult = "";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstIndexGreaterSecond_Negative () {
        String str = "Red rover";
        int startIndex = 6;
        int endIndex = 1;
        String expectedResult = "";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstIndexEqualsSGreaterSecond_Negative () {
        String str = "Red rover";
        int startIndex = 6;
        int endIndex = 1;
        String expectedResult = "";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyString_Negative () {
        String str = "";
        int startIndex = 0;
        int endIndex = 0;
        String expectedResult = "Empty";

        String actualResult = new StringMethods()
                .removeTextBetweenGivenIndices(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    [QA, for, Everyone]

    @Test
    public void testGetArrayFromSentence () {
        String text = "QA for Everyone";
        String[] expectedResult = new String[]{"QA", "for", "Everyone"};

        String[] actualResult = new StringMethods().getArrayFromSentence(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetEmptyArrayFromEmptySentence () {
        String text = "";
        String[] expectedResult = {};

        String[] actualResult = new StringMethods().getArrayFromSentence(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPrintFirstNameSurnameLastNameFromText () {
        String text = "Александр Сергеевич Пушкин";
        String expectedResult = "Имя: Александр\nОтчество: Сергеевич\nФамилия: Пушкин";

        String actualResult = new StringMethods().printFirstNameSurnameLastNameFromText(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRepeatStringOnNumberTimes () {
        String text = "one";
        int number = 5;
        String expectedResult = "oneoneoneoneone";

        String actualResult = new StringMethods().repeatStringOnGivenNumber(text, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoRepeatEmptyString_Negative () {
        String text = "";
        int number = 5;
        String expectedResult = "";

        String actualResult = new StringMethods().repeatStringOnGivenNumber(text, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoRepeatNumberIsZero_Negative () {
        String text = "one";
        int number = 0;
        String expectedResult = "";

        String actualResult = new StringMethods().repeatStringOnGivenNumber(text, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoRepeatNumberIsMinus_Negative () {
        String text = "one";
        int number = -10;
        String expectedResult = "";

        String actualResult = new StringMethods().repeatStringOnGivenNumber(text, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetNumberOfLetter () {
        String text = "one";
        int index = 0;
        int expectedResult = 111;

        int actualResult = new StringMethods().getNumberOfLetterAtGivenIndex(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyReturnNumberIsNegative_Negative () {
        String text = "one";
        int index = -1;
        int expectedResult = 0;

        int actualResult = new StringMethods().getNumberOfLetterAtGivenIndex(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZeroReturnEmptyString_Negative () {
        String text = "";
        int index = 1;
        int expectedResult = 0;

        int actualResult = new StringMethods().getNumberOfLetterAtGivenIndex(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareThreeWordsWithDifferentCase () {
        String str1 = "one";
        String str2 = "One";
        String str3 = "ONE";

        boolean expectedResult = true;

        boolean actualResult = new StringMethods().compareIsThreeWordsTheSame(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareTwoSameWordsWithDifferentWord () {
        String str1 = "one";
        String str2 = "Один";
        String str3 = "ONE";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareIsThreeWordsTheSame(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareTwoSameWordsWithEmptyWord () {
        String str1 = "one";
        String str2 = "onE";
        String str3 = "";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareIsThreeWordsTheSame(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }



}



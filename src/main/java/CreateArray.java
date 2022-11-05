import java.util.Arrays;

public class CreateArray {
    //написать метод createIntArray(), который принимает на вход
//        5 целых чисел,  и возвращает массив из этих же чисел.
//        Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int[] createIntArray(int number1, int number2, int number3, int number4, int number5) {

        return new int[]{number1, number2, number3, number4, number5};
    }

//    Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
//    и возвращает массив из этих же чисел

    public double[] createDoubleArray(double number1, double number2, double number3,
                                      double number4, double number5) {

        return new double[]{number1, number2, number3, number4, number5};
    }

//    Написать метод createStringArray(), который принимает на вход 5 слов,
//    и возвращает массив из этих слов

    public String[] createStringArray(String a, String b, String c, String d, String e) {

        return new String[]{a, b, c, d, e};
    }

//    Написать метод createArrayFromText(), который принимает на вход предложение
//    из нескольких слов и возвращает массив из этих слов.

    public String[] createArrayFromText(String sentence) {

        return sentence.split(" ");
    }

//    написать метод createIntArrayFromText(), который принимает на вход
//    строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает массив
//    типа int[] из этих чисел.

    public int[] createIntArrayFromText(String text) {
        if (text != null || text.length() > 0) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) < '0' && text.charAt(i) > '9') {
                    return new int[]{};
                }
            }
        }

        String[] stringArray = text.split(" ");

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].contains(".")) {
                intArray[i] = (int) Double.parseDouble((stringArray[i]));
            } else {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
        }

        return intArray;
    }


//    написать метод multiplesOf(), который принимает на вход целое
//    положительные число number в пределах от 1 включительно до 10
//    включительно, и возвращает таблицу умножения на это число в виде массива
//    Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public int[] multiplesOf (int number) {
        if (number > 0 && number <= 10) {
            int[] multiplesArray = new int[11];
            int startNumber = 0;
            for (int i = 0; i < multiplesArray.length; i++) {
                multiplesArray[i] = number * startNumber;
                startNumber++;
            }

            return multiplesArray;
        }

        return new int[]{};
    }
}
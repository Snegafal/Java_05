import java.util.Arrays;

public class OddEvenValuesInArray {
//    Написать метод countEvenValuesInArray(), который принимает на
//    вход массив целых чисел, и возвращает количество четных чисел в этом массиве

    public int countEvenValuesInArray (int[] array) {
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }

        return evenNumbers;
    }

    public int countOddValuesInArray (int[] array) {
        int oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers++;
            }
        }

        return oddNumbers;
    }

    //    написать метод countOddEvenValuesInArray(), который принимает на вход
//    массив целых чисел и возвращает массив int[2], который содержит количество
//    четных и нечетных элементов входящего массива

    public int[] countOddEvenValuesInArray(int[] array) {
        if (array.length > 0) {
            int evenNumbers = new OddEvenValuesInArray().countEvenValuesInArray(array);
            int oddNumbers = new OddEvenValuesInArray().countOddValuesInArray(array);

            return new int[]{evenNumbers, oddNumbers};
        }

        return new int[]{};
    }

//    написать метод createOddEvenArray(),
//    который принимает массив целых случайных чисел, и возвращает
//    двумерный массив (массив четных и массив нечетных чисел)

    public int[][] createOddEvenArray (int[] array) {
        if (array.length > 0) {
            int evenNumbers = new OddEvenValuesInArray().countEvenValuesInArray(array);
            int oddNumbers = new OddEvenValuesInArray().countOddValuesInArray(array);
            int [] newArrayEven = new int[evenNumbers];
            int [] newArrayOdd = new int[oddNumbers];
            int k = 0;
            int n = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    newArrayEven[k] = array[i];
                    k++;
                } else {
                    newArrayOdd[n] = array[i];
                    n++;
                }
            }

            return new int[][]{newArrayEven, newArrayOdd};
        }

        return new int[][]{};
    }
}

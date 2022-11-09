//Написать алгоритм ReverseArray, который принимает на вход
//        массив целых чисел, и возвращает “перевернутый” массив.
//        Test Data:
//        {2, 7, 3, 10} → {10, 3, 7, 2}


import java.util.Arrays;

public class ReverseArray {

    public int[] makeArrayReversed (int[] array) {
        int[] reversedArray = new int[array.length];
        int reversedArrayIndex = 0;
        for (int i = array.length - 1; i >= 0; i--, reversedArrayIndex++) {
            reversedArray[reversedArrayIndex] = array[i];
        }

        return reversedArray;
    }
}


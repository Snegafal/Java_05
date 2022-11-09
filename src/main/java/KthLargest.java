//Написать алгоритм KthLargest, который принимает на вход
// массив целых чисел и число k, и возвращает k-тый максимальный элемент.
//({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9


import java.util.Arrays;

public class KthLargest {
    public int getRthLargestElementOfArray (int[] array, int k){
        if (k <= array.length && array.length != 0 && k > 0) {
            int[] sortedArray = new SortArray().sortArray(array);
            return sortedArray[array.length - k];
        }

        return 0;
    }

}

//Написать алгоритм SortArray, который принимает на вход
// массив целых чисел, и сортирует элементы массива в порядке возрастания.
//        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}


public class SortArray {
    public int[] sortArray (int[] array) {
        if (array.length > 0) {

            for (; ; ) {

                int count = 0;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = temp;
                        count++;
                    }
                }

                if (count == 0) {
                    break;
                }
            }
        }
        return array;
    }


}

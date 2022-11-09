//Написать алгоритм PeakElement, который принимает на
// вход массив целых чисел и возвращает значения
// пиковых элементов (элементы, которые больше своих соседей).
//{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}


public class PeakElement {
    public int[] getPeakElementsInArray(int[] array) {
        if (array.length > 1) {
            int count = 0;
            if (array[0] > array[1]) {
                count++;
            }

            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    count++;
                }
            }

            if (array[(array.length - 1)] > array[(array.length - 2)]) {
                count++;
            }

            int[] peakElementsArray = new int[count];

            int index = 0;

            if (array[0] > array[1]) {
                peakElementsArray[0] = array[0];
                index++;
            }

            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    peakElementsArray[index] = array[i];
                    index++;
                }
            }

                if (array[(array.length - 1)] > array[(array.length - 2)]) {
                    peakElementsArray[index] = array[(array.length - 1)];
                }

                return peakElementsArray;
            }

        return new int[0];
    }
}





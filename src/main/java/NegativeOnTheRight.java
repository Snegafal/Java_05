//Написать алгоритм NegativeOnTheRight, который принимает
// на вход массив целых чисел, и возвращает массив,
// в котором все негативные числа находятся во второй
// половине массива (массив не должен быть отсортирован)
//        {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}


    public class NegativeOnTheRight {
        public int[] getNegativeOnTheRightArray(int[] array) {
            int[] negativeOnTheRightArray = new int[array.length];
            int posIndex = 0;
            int negIndex = array.length - 1;
            int j = 0;

            for (int i = array.length - 1; i >= 0; i--, j++) {

                if (array[i] < 0) {
                    negativeOnTheRightArray[negIndex] = array[i];
                    negIndex--;
                }

                if (array[j] >= 0) {
                    negativeOnTheRightArray[posIndex] = array[j];
                    posIndex++;
                }
            }

                return negativeOnTheRightArray;
        }
    }



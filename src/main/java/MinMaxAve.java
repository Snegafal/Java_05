//Написать алгоритм MinMaxAve, который принимает массив чисел int[]
//и 2 значения индексов. Алгоритм возвращает массив,
//который содержит минимальное значение, максимальное значение,
//и среднее среди всех значений между 2-мя индексами.
//Test Data:
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}


public class MinMaxAve {
    public int[] createArrayMinMaxAveofAnotherArrayGivenIndices
            (int[] array, int index1, int index2) {
        if (array.length >= 2 && array.length >= index1 && array.length >= index2) {
            int[] newArray = new int[3];

                newArray[2] = (array[index1] + array[index2]) / 2;
                if (array[index1] >= array[index2]) {
                    newArray[0] = array[index2];
                    newArray[1] = array[index1];
                }

                    newArray[0] = array[index1];
                    newArray[1] = array[index2];

                return newArray;
            }

        return new int[0];
        }
    }


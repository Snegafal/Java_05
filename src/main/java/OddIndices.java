public class OddIndices {
    public int[] oddIndicesInArray (int[] array) {
        if (array != null) {
            int[] newArray = new int[array.length / 2];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    newArray[j] = array[i];
                    j++;
                }
            }

            return newArray;
        }

        return new int[0];
    }
}


//Написать алгоритм OddIndices, который принимает массив целых чисел,
// и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}
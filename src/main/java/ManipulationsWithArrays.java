import java.util.Arrays;

public class ManipulationsWithArrays {

//    Написать метод multiplуArrayByNumber(), который принимает на вход
//    массив целых чисел и число int number. Метод возвращает массив
//    тех же чисел, умноженных на number
//    Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

    public int[] multiplуArrayByNumber(int[] array, int number) {
        if (array == null) {

            return new int[0];
        }
            int[] multipliedByNumberArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                int multipliedNumber = array[i] * number;
                if (multipliedNumber / number == array[i]) {
                    multipliedByNumberArray[i] = array[i] * number;
                } else {

                    return new int[0];
                }
            }

        return multipliedByNumberArray;
    }

//    Написать метод toDoubleArray(), который принимает на вход
//    массив целых чисел,  и возвращает массив типа double[] из тех же чисел
//    Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

    public double[] toDoubleArray(int[] array) {
        if (array != null) {
            double[] toDoubleArray = new double[array.length];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                toDoubleArray[index] = array[i];
                index++;

public class ManipulationsWithArrays {
    public ManipulationsWithArrays() {
    }

    public int[] multiplуArrayByNumber(int[] array, int number) {
        if (array == null) {
            return new int[0];
        } else {
            int[] multipliedByNumberArray = new int[array.length];

            for(int i = 0; i < array.length; ++i) {
                int multipliedNumber = array[i] * number;
                if (multipliedNumber / number != array[i]) {
                    return new int[0];
                }

                multipliedByNumberArray[i] = array[i] * number;
            }

            return multipliedByNumberArray;
        }
    }

    public double[] toDoubleArray(int[] array) {
        if (array == null) {
            return new double[0];
        } else {
            double[] toDoubleArray = new double[array.length];
            int index = 0;

            for(int i = 0; i < array.length; ++i) {
                toDoubleArray[index] = (double)array[i];
                ++index;
            }

            return toDoubleArray;
        }

        return new double[0];
    }

//    Написать метод toIntArray(), который принимает на вход массив
//    типа double[],  и возвращает массив типа int[] из тех же чисел
//    Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

    public int[] toIntArray(double[] array) {
        if (array != null) {
            int[] toIntArray = new int[array.length];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                toIntArray[index] = (int) array[i];
                index++;
    }

    public int[] toIntArray(double[] array) {
        if (array == null) {
            return new int[0];
        } else {
            int[] toIntArray = new int[array.length];
            int index = 0;

            for(int i = 0; i < array.length; ++i) {
                toIntArray[index] = (int)array[i];
                ++index;
            }

            return toIntArray;
        }

        return new int[0];
    }

//    Написать метод toStringArray(), который принимает на вход массив
//    целых чисел, и возвращает массив типа String[] из тех же чисел
//    (желательно не использовать метод .toString(), нужно переводить вручную)
//    Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}

    public String[] toStringArray (int[] array) {
        if (array != null) {
            String[] stringArray = new String[array.length];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                stringArray[index] = String.valueOf(array[i]);
                index++;
    }

    public String[] toStringArray(int[] array) {
        if (array == null) {
            return new String[0];
        } else {
            String[] stringArray = new String[array.length];
            int index = 0;

            for(int i = 0; i < array.length; ++i) {
                stringArray[index] = String.valueOf(array[i]);
                ++index;
            }

            return stringArray;
        }

        return new String[0];
    }

//    Перегрузить метод toStringArray() параметром double[]. Этот метод
//    должен возвращать массив типа String[]

    public String[] toStringArray (double[] array) {
        if (array != null) {
            String[] stringArray = new String[array.length];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                stringArray[index] = String.valueOf(array[i]);
                index++;
    }

    public String[] toStringArray(double[] array) {
        if (array == null) {
            return new String[0];
        } else {
            String[] stringArray = new String[array.length];
            int index = 0;

            for(int i = 0; i < array.length; ++i) {
                stringArray[index] = String.valueOf(array[i]);
                ++index;
            }

            return stringArray;
        }

        return new String[0];
    }

//    написать метод areValuesGreaterThanNumber(), который принимает
//    на вход массив целых чисел и число number. Метод возвращает
//    значение true, если все элементы массива больше number,
//    иначе возвращает false

    public static boolean areValuesGreaterThanNumber (int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areValuesGreaterThanNumber(new int[]{1, 4, 45}, 67));
    }
    }

    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        for(int i = 0; i < array.length; ++i) {
            if (array[i] <= number) {
                return false;
            }
        }

        return true;
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

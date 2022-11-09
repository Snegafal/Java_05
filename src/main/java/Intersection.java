//Написать алгоритм Intersection, который принимает на вход
//        2 массива целых чисел и возвращает массив общих элементов.
//        Test Data:
//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}

class Intersection {
    public int countIntersection (int[] array1, int[] array2) {
        int intersectionCount = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersectionCount++;

                }
            }
        }

        return intersectionCount;
    }

    public int[] getIntersectionInTwoArrays (int[] array1, int[] array2) {
        int[] intersectionArray = new int[countIntersection(array1, array2)];
        int intersectionArrayIndex = 0;
        boolean equalnumbers = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && equalnumbers) {
                    intersectionArray[intersectionArrayIndex] = array1[i];
                    intersectionArrayIndex++;
                    equalnumbers = false;
                }
            }
        }
        return intersectionArray;
    }
}

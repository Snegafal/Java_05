//Напишите алгоритм BiggerValue, который из двух параметров типа int
// возвращает бОльшее значение.

public class BiggerValue {
    public static int getBiggerValueOutOfTwoNumbers (int number1, int number2) {
        if (number1 >= number2) {

            return number1;
        }

        return number2;
    }

    public static void main(String[] args) {
        System.out.println(getBiggerValueOutOfTwoNumbers(4545, 767));
    }

}

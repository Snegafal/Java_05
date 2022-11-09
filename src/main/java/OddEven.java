//В классе OddEven создать алгоритм oddEven(), который принимает
// на вход целое число, возвращает “Odd”,  если число нечетное,
// и “Even”, если число четное.


public class OddEven {
    public static String oddOrEvenNumber(int number) {
        if (number % 2 == 0) {

            return "Even";
        }

        return "Odd";
    }
}
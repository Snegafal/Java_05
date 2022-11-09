//Написать метод removeSpaces(), который принимает на вход строку.
//        Если строка не пустая (проверить методом класса String), то примените
//        метод по удалению пробелов в начале и в конце строки.
//        Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
//        Если пробелы были, то метод должен удалить их и вернуть сообщение:
//        “Лишние пробелы удалены”.
//        Если пробелов не было, вернуть сообщение “Пробелов не было”.
//        Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public String removeSpaces (String str) {
        if (str.isEmpty()) {

            return "Строка пустая";
        }

        String strNoAdditionalSpaces = str.trim();

        if (strNoAdditionalSpaces.equals(str)) {

            return "Пробелов не было";

        } else {

            return "Лишние пробелы удалены";
        }
    }

//    Написать алгоритм removeAllAs().
//    С помощью методов из видео1,  написать алгоритм, который принимает
//    на вход строку. Если строка валидная, то метод удаляет все буквы
//    a из строки, если таковые имеются. Метод возвращает обработанную строку.
//            “    Red Rover School   “ →  “Red Rover School“
//            “panda   “ → “pnd”
//            “taramasalata” → “trmslt”

    public String removeAllAs (String str) {
        if (!str.isEmpty()) {
            String noSpacesStr = str.trim();
            return noSpacesStr.replace("a", "");
        }

        return "";
    }

//    Написать алгоритм removeAllZeros().
//    который принимает на вход строку, состоящую из цифр. Если строка валидная, то метод
//    удаляет все пробелы из строки, если таковые имеются.
//    Метод возвращает обработанную строку, в которой нет нулей.
//    Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
//    Test Data:
//            “3504209706040000 “ →  “35429764“
//            “0000000111“ → “111”

    public String removeAllZeros (String str) {
        if (!str.isEmpty()) {
            if (str.trim().replace("0", "").equals(str)) {

                return "This is a valid string";
            } else {

                return str.trim().replace("0", "");
            }
        }

        return "";
    }

//    Написать алгоритм removeAllSpaces, который принимает
//    на вход строку. Если строка валидная, то метод удаляет все пробелы
//    из строки, если таковые имеются. Метод возвращает обработанную строку.
//
//            “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//            “p a     n   d a   “ → “panda”

    public String removeAllSpaces (String str) {
        if (!str.isEmpty()) {
            return str.replace(" ", "");
        }

        return "";
    }

//    Напишите метод countAs(), который принимает на вход строку и считает,
//    сколько букв а или А содержится в строке. Метод возвращает количество
//    букв a/A,  и количество букв/знаков в слове без букв a/A.
//
//            “Abracadabra” → “5, 6”
//            “Homenum Revelio” → “0, 15”
//            “3 tarAmasAlatA” → “6, 8”

    public String countAs (String str) {
        if (!str.isEmpty()) {
            int countAas = 0;
            String newStr = str.trim().toLowerCase();
            for (char i : newStr.toCharArray() )
            if (i == 'a') {
                countAas++;
            }
            int countOthersSymbols = str.length() - countAas;

            return (countAas + ", " + countOthersSymbols);
        }

        return "";
    }

//    Напишите метод countJava(), который принимает на вход текст и проверяет,
//    содержится ли в тексте хотя бы одно слово Java.

    public boolean countJava(String text) {
        return text.contains("Java");
    }

//    Напишите метод insertQuotes(), который принимает слово и возвращает строку,
//    в которой это слово “обернуто” в кавычки

    public String insertQuotes(String str) {
        return "\"" + str.trim() + "\"";
    }

//    Напишите метод insertQuotes(), который принимает на вход две строки,
//    и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
//            (результат строится с помощью метода concat())

    public String insertQuotes (String str1, String str2) {
        if (!str1.isEmpty() && !str2.isEmpty()) {

            if (str1.contains("писал")) {
                int wroteIndex = str1.indexOf("писал");
                String firstPart = str1.substring(0, wroteIndex + 5).trim();
                return "".concat(firstPart).concat(": ").concat(insertQuotes(str2.trim()));
            } else {

                return "";
            }

        }

        return "";
    }

//    Напишите метод, кторый принимает на вход название города и исправляет написание:
//    Test Data:
//            “ташкент” → “Ташкент”
//            “ЧикаГО” → “Чикаго”

    public String reWriteCityName (String city) {
        String firstLetter = city.trim().substring(0, 1).toUpperCase();
        String restPart = city.trim().substring(1).toLowerCase();

        return firstLetter.concat(restPart);
    }

//    Напишите метод, который принимает на вход строку и букву-параметр, и возвращает
//    все, что находится между первой и последней буквой-параметром:
//
//            “Abracadabra”, “b” → “bracadab”
//            “Whippersnapper”, “p” → “ppersnapp”

    public String getTextBetweenFirstAndLastParameter (String str, String letter) {
        String text = str.trim();
        if (!text.isEmpty()) {
            return text.substring(text.indexOf(letter), text.lastIndexOf(letter) + 1);
        }

        return "0";
    }

//    Напишите метод, который принимает на вход слово, и возвращает true,
//    если слово начинается и заканчивается на одинаковую букву, и false иначе
//
//            “Abracadabra” → true
//            “Whippersnapper” → false

    public boolean isWordAnagram (String str) {
        String word = str.trim().toLowerCase();

        return word.substring(0, 1).equals(word.substring(word.length() - 1));
    }

//    Напишите метод, который принимает на вход строку из двух слов,
//    разделенных пробелом, и возвращает последнее слово
//
//            “Red Rover” → “Rover”

    public String getSecondWordOutOfTwo (String str) {
        if (!str.isEmpty()) {
            String text = str.trim();
            int spaceIndex = text.indexOf(" ");
            return text.substring(spaceIndex + 1);
        }

        return "";
    }

//    Написать метод, который принимает строку, и 2 индекса.
//    Метод удаляет все, что находится между двумя индексами включительно
//
//            “Red rover”, 1, 4 → “Rover”

    public String removeTextBetweenGivenIndices (String str, int startIndex, int endIndex) {
        String text = str.trim();
        if (text.isEmpty()) {

            return "Empty";
        }

        if (startIndex < endIndex && startIndex <= text.length() && endIndex <= text.length()) {
            String firstPart = text.substring(0, startIndex);
            String lastPart = text.substring(endIndex + 1);
            return firstPart.concat(lastPart);
        }

        return "";
    }

//    Напишите метод, который принимает на вход предложение и возвращает
//    слова из этого предложения в виде массива слов
//
//    “QA for Everyone” → {“QA”, “for”, “Everyone”}

    public String[] getArrayFromSentence (String text) {
        if (!text.isEmpty()) {
            String[] array = text.trim().split(" ");

            return array;
        }

        return new String[0];
    }

//    Написать метод, который принимает на вход предложение, которое
//    состоит из имени, фамилии, отчества и возвращает текст:
//
//    “Александр Сергеевич Пушкин” →
//
//    “Имя: Александр
//    Отчество: Сергеевич
//    Фамилия: Пушкин”

    public String printFirstNameSurnameLastNameFromText (String text) {
        String[] array = text.split(" ");
        if (array.length == 3) {
            return "Имя: ".concat(array[0]) + "\n"
                    + "Отчество: ".concat(array[1]) + "\n"
                    + "Фамилия: ".concat(array[2]);
        }

        return "";
    }

//    Написать метод, который принимает на вход слово и число n,  и
//    возвращает строку, где слово повторяется n раз.
//    Test Data:
//            “one”, 5 → “oneoneoneoneone”

    public String repeatStringOnGivenNumber (String str, int number) {
        if (!str.isEmpty() && number > 0) {

            return str.trim().repeat(number);
        }

        return "";
    }

//    Напишите метод, который принимает строку и index, и возвращает
//    численное значение буквы, которая находится на позиции index
//    (использовать только один метод класса String)

    public int getNumberOfLetterAtGivenIndex (String str, int index) {
        if (!str.isEmpty() && index < str.length() && index >= 0) {
            return str.charAt(index);
        }

        return 0;
    }

//    Написать метод, который принимает 3 слова, и сравнивает их методом,
//    который считает, что прописные и заглавные буквы - это одни и
//    те же буквы. Метод возвращает true, если все слова одинаковы,
//    и метод возвращает false, если слова не одинаковы:
//
//            “one”, “One”, “ONE”  → true
//            “one”, “Один”, “ONE” → false

    public boolean compareIsThreeWordsTheSame (String str1, String str2, String str3) {

        return str1.equalsIgnoreCase(str2) && str2.equalsIgnoreCase(str3);
    }
}

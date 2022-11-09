package openWeather;

//На сайте openWeather.com найдите в документации названия городов
// на языках, которые поддерживаются в запросах (geocoding).
// Найдите и скопируйте, как называется город Лондон на языках
//        Greek
//        Persian (Farsi)
//        Hindi
//        French
//        English

// Создать переменные типа String с названиями города Лондон на перечисленных выше языках.

//Создать метод createRequest(), который принимает на вход параметры:
//        String cityName
//        String apiKey
//        Метод возвращает строку запроса по названию города
//        (шаблон запроса нужно взять в документации), вставляя необходимые параметры в шаблон.
//        Метод так же печатает созданные запросы на разных языках.
//        Скопируйте полученные строки запросов, сделайте запросы в браузере,
//        и сравните ответы, совпадают ли они или нет.


public class HTTPRequest {
    String cityGreek = "Λονδίνο";
    String cityPersian = "لندن";
    String cityHindi = "लंदन";
    String cityFrench = "Londres";
    String cityEnglish = "London";

     String apiKey = "4d2055e52f8dedbce377c3206d2931cc";

    public String createRequest (String cityName, String apiKey) {
        String request = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName
                + "&appid=" + apiKey;

        return request;
    }

    public void printRequestsInDifferentLanguages () {
        System.out.println(createRequest(cityGreek, apiKey));
        System.out.println(createRequest(cityPersian, apiKey));
        System.out.println(createRequest(cityFrench, apiKey));
        System.out.println(createRequest(cityHindi, apiKey));
        System.out.println(createRequest(cityEnglish, apiKey));
    }
}

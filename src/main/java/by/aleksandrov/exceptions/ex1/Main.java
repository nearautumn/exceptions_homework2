package by.aleksandrov.exceptions.ex1;

public class Main {
    public static void main(String[] args) {

        FloatScanner floatScanner = new FloatScanner();
        float result;

        do {
            result = floatScanner.init();
        } while (result == -1); // метод init() возвращает -1 в качетсве кода ошибки при появлении исключения
    }
}

import java.util.Date;

public class Formatting {
    public static void main(String[] args) {
    //Practice1
        // Используем спецификаторы формата для различных типов данных
        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 123;
        double doubleValue = 456.789;
        Date currentDate = new Date();

        // Пример использования спецификатора %b для логического значения
        System.out.printf("Boolean value: %b%n", boolValue);  // Output: Boolean value: true

        // Пример использования спецификатора %c для символа
        System.out.printf("Character value: %c%n", charValue);  // Output: Character value: A

        // Пример использования спецификатора %d для десятичного целого числа
        System.out.printf("Integer value: %d%n", intValue);  // Output: Integer value: 123

        // Пример использования спецификатора %f для числа с плавающей точкой
        System.out.printf("Double value: %f%n", doubleValue);  // Output: Double value: 456.789000

        // Пример использования спецификатора %t для времени и даты
        System.out.printf("Current date and time: %tF%n", currentDate);  // Output: Current date and time: 2024-11-30

    //Practice2
        //Метод flush() очищает буфер и отправляет данные в выходной поток.

    //Practice3
        Date date = new Date();

        // Использование спецификаторов формата даты и времени
        System.out.printf("Час (00–23): %tH%n", date);  // Час в 24-часовом формате
        System.out.printf("Час (1–12): %tI%n", date);  // Час в 12-часовом формате
        System.out.printf("Минуты (00–59): %tM%n", date);  // Минуты
        System.out.printf("Секунды (00–59): %tS%n", date);  // Секунды
        System.out.printf("Полное название месяца: %tB%n", date);  // Полное название месяца
    }
}

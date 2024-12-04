import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрос имени
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Вывод
        System.out.println("Привет, " + name);

        // Закрываем Scanner
        scanner.close();
    }
}

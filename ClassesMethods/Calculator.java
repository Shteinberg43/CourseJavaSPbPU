public class Calculator {

    // Метод для сложения переменного числа целых чисел
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Перегрузка метода для сложения переменного числа вещественных чисел
    public double add(double... numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Перегрузка метода для сложения переменного числа строк
    public String add(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов метода для сложения целых чисел
        int intSum = calculator.add(1, 2, 3, 4, 5);
        System.out.println("Сумма целых чисел: " + intSum); // Сумма целых чисел: 15

        // Вызов метода для сложения вещественных чисел
        double doubleSum = calculator.add(1.5, 2.5, 3.0);
        System.out.println("Сумма вещественных чисел: " + doubleSum); // Сумма вещественных чисел: 7.0

        // Вызов метода для объединения строк
        String stringSum = calculator.add("Hello", "world", "from", "Java");
        System.out.println("Объединённые строки: " + stringSum); // Объединённые строки: Hello world from Java
    }
}

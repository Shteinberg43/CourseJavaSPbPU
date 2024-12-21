public class Cycles {
    public static void main(String[] args) {
    //Practice1
        while (true) {
            System.out.println("Это бесконечный цикл while");
        }
        do {
            System.out.println("Это бесконечный цикл do-while");
        } while (true);
    //Practice2
        // Цикл от 1 до 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Пропускает итерацию, если число четное
            }

            // Если число равно 7, выходим из цикла
            if (i == 7) {
                break;  // Прерывает выполнение цикла, если i равно 7
            }

        }
    }
}

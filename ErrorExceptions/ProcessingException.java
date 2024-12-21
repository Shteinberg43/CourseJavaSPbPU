public class ProcessingException {
    public static void main(String[] args) {
        try {
            // Генерация и перехват ArithmeticException
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        //Аварийная остановка
        int[] array = {1, 2, 3};
        System.out.println(array[5]); // ArrayIndexOutOfBoundsException
    }
}

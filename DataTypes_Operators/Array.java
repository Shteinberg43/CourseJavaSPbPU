import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
    //Practice1
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        a1 = a2;
        //После выполнения кода массив `a1` будет ссылаться на тот же массив, что и `a2`.
        //Таким образом, `a1` и `a2` оба будут ссылаться на `{6,7,8,9,10}`.
        //Первоначальное содержимое `a1` будет утеряно.
    //Practice2
        // Инициализация массивов
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        // 1. toString() - преобразует массив в строковое представление
        System.out.println("array1: " + Arrays.toString(array1));  // Выведет: array1: [1, 2, 3, 4, 5]
        System.out.println("array2: " + Arrays.toString(array2));  // Выведет: array2: [5, 4, 3, 2, 1]

        // 2. binarySearch() - выполняет бинарный поиск в отсортированном массиве
        Arrays.sort(array2);  // Для корректного поиска массив должен быть отсортирован
        int index = Arrays.binarySearch(array2, 3);  // Ищем число 3 в отсортированном массиве
        System.out.println("Индекс числа 3 в отсортированном array2: " + index);  // Выведет индекс числа 3

        // 3. equals() - проверка на равенство массивов
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Массивы равны? " + areEqual);  // Выведет: false, потому что массивы разные

        // 4. compare() - сравнивает два массива
        int comparisonResult = Arrays.compare(array1, array2);
        System.out.println("Результат сравнения array1 и array2: " + comparisonResult);  // Выведет отрицательное число (array1 < array2)

        // 5. sort() - сортирует массив
        System.out.println("До сортировки array2: " + Arrays.toString(array2));  // Выведет: array2: [1, 2, 3, 4, 5]
        Arrays.sort(array2);  // Сортируем массив
        System.out.println("После сортировки array2: " + Arrays.toString(array2));  // Выведет: array2: [1, 2, 3, 4, 5]
    }

}

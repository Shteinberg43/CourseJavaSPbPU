// Пример параметризованного класса
public class A<T> {
    private T value;

    public A(T value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов Box с различными типами
        A<Integer> integerA = new A<>(5);
        A<String> stringA = new A<String>("Hello");

        // Проверка с использованием instanceof
        if (integerA instanceof A) {
            System.out.println("integerA is an instance of A");
        }

        if (stringA instanceof A) {
            System.out.println("stringA is an instance of A");
        }

        // Следующий код не будет работать:
        if (integerA instanceof A<Integer>) {  // Ошибка компиляции
            System.out.println("integerA is an instance of A<Integer>");
        }
    }
}
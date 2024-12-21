// Пример интерфейса с вложенным классом
interface MyInterface {
    // Вложенный класс
    class NestedClass {
        void func() {
            System.out.println("Inside NestedClass");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        // Пример вызова метода вложенного класса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.func();
    }
}
// Базовый класс
class Parent { }

// Подклассы
class A extends Parent { }
class B extends Parent { }

class SubA extends A { }

// Класс с параметризированным типом
class Wrapper<T> {
    // Лист, в который можно помещать объекты типов T и его суперклассов
    public List<? super T> listParent = new ArrayList<>();
    // Лист, в который можно помещать объекты типов T и его подклассов
    public List<? extends T> listChild;
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Parent p = new Parent();
        SubA sa = new SubA();

        Wrapper<A> a1 = new Wrapper<>();

        a1.listChild = new ArrayList<Parent>(); // Ошибка компиляции
        a1.listChild = new ArrayList<A>(); // Выполняется корректно
        a1.listParent = new ArrayList<A>(); // Выполняется корректно
        a1.listParent = new ArrayList<Parent>(); // Выполняется корректно
        a1.listParent = new ArrayList<B>(); // Ошибка компиляции
    }
}
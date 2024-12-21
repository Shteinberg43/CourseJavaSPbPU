//Practice1
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

class MyClass implements MyInterface {
    // Необязательно переопределять defaultMethod.
}

public class Task01 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов default-метода через экземпляр класса
        myClass.defaultMethod();

        // Вызов static-метода напрямую через интерфейс
        MyInterface.staticMethod();
    }
}
//Practice2
interface Interface1 {
    default void display() {
        System.out.println("Display from Interface1");
    }
}

interface Interface2 {
    default void display() {
        System.out.println("Display from Interface2");
    }
}

class MyClass implements Interface1, Interface2 {
    @Override
    public void display() {
        System.out.println("Resolved display method in MyClass");
    }
}

public class Task02 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();  // Результат: Resolved display method in MyClass
    }
}

//Если класс реализует два интерфейса с одинаковыми default-методами, возникает конфликт.
//Чтобы его решить, класс должен переопределить метод.
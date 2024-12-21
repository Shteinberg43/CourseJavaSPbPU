//Pracrice1
// Внешний класс
public class OuterClass {
    // Внутренний публичный класс доступен везде.
    public class PublicInner {
    }

    // Внутренний защищенный класс доступен в пакете и подклассах.
    protected class ProtectedInner {
    }

    // Внутренний класс с доступом по умолчанию  доступен в пакете.
    class DefaultInner {
    }

    // Внутренний приватный класс доступен только в классе `Outer`.
    private class PrivateInner {
    }
}


//Practice2
public class OuterClass {
    private int privateField = 10;
    protected int protectedField = 20;
    public int publicField = 30;
    int defaultField = 40;

    private void privateMethod() {
        System.out.println("Private method in OuterClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in OuterClass");
    }

    public void publicMethod() {
        System.out.println("Public method in OuterClass");
    }

    void defaultMethod() {
        System.out.println("Default method in OuterClass");
    }

    public class InnerClass {
        public void accessOuterClassMembers() {
            // Внутренний класс имеет доступ ко всем членам внешнего класса
            System.out.println("Accessing private field: " + privateField);
            System.out.println("Accessing protected field: " + protectedField);
            System.out.println("Accessing public field: " + publicField);
            System.out.println("Accessing default field: " + defaultField);

            // Внутренний класс может вызывать все методы внешнего класса
            privateMethod();
            protectedMethod();
            publicMethod();
            defaultMethod();
        }
    }
}

//Pracice3
public class OuterClass {
    // Внутренний класс
    public class InnerClass {
        // Поля внутреннего класса
        private int innerPrivateField = 30;
        public int innerPublicField = 40;

        // Метод внутреннего класса
        public void display() {
            System.out.println("InnerClass display method");
        }

        private void privateMethod() {
            System.out.println("Private method in InnerClass");
        }
    }

    public void accessInnerClass() {
        // Внешний класс может создать экземпляр внутреннего класса
        InnerClass inner = new InnerClass();

        // Доступ к публичным членам внутреннего класса
        System.out.println("Accessing innerPublicField: " + inner.innerPublicField);
        inner.display();

        // Невозможно получить доступ к private членам внутреннего класса
        System.out.println(inner.innerPrivateField); // Ошибка компиляции
        inner.privateMethod(); // Ошибка компиляции

        // Невозможно получить доступ к полям внутреннего класса напрямую
        innerPublicField = 30; // Ошибка компиляции
    }
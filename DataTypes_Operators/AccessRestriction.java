class AccessModifiersExample {

    // public - доступен из любого места
    public int publicField = 1;

    // protected - доступен внутри пакета и наследникам
    protected int protectedField = 2;

    // private - доступен только внутри класса
    private int privateField = 3;

    // default (пакетный доступ) - доступен внутри пакета
    int defaultField = 4;

    // public метод - доступен из любого места
    public void publicMethod() {
        System.out.println("Public method called.");
    }

    // protected метод - доступен внутри пакета и для наследников
    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }

    // private метод - доступен только внутри класса
    private void privateMethod() {
        System.out.println("Private method called.");
    }

    // default метод - доступен внутри пакета
    void defaultMethod() {
        System.out.println("Default method called.");
    }
}

public class AccessRestriction {

    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();

        // Доступ к полям и методам
        System.out.println("Public field: " + obj.publicField); // Доступен
        System.out.println("Protected field: " + obj.protectedField); // Доступен
        System.out.println("Default field: " + obj.defaultField); // Доступен

        System.out.println("Private field: " + obj.privateField); // Ошибка компиляции

        obj.publicMethod(); // Доступен
        obj.protectedMethod(); // Доступен
        obj.defaultMethod(); // Доступен

        obj.privateMethod(); // Ошибка компиляции
    }
}

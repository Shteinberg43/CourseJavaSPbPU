
    // Инициализация через конструктор
    public A(int value) {
        a = value;
    }

    public static void main(String[] args) {
        A obj = new A(10);
        System.out.println(obj.a);  // Выведет: 10
    }

    // Инициализация через блок инициализации
    {
        a = 5;
    }

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);  // Выведет: 5
    }

    // Инициализация при объявлении
    public final int a = 100;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);  // Выведет: 100
    }

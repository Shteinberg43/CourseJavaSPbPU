//Practice1
class Parent {
    int x;

    void method() {
        System.out.println("Метод родительского класса.");
    }

    Parent() {
        System.out.println("Конструктор родительского класса.");
    }
}

class Child extends Parent {
    int x;

    void method() {
        System.out.println("Метод подкласса.");
    }

    Child() {
        super(); // Вызов конструктора родительского класса
        super.x = 30; // Обращение к полю родительского класса
        super.method(); // Вызов метода родитеского класса
    }
}


//Practice2
//Если метод `method()` класса `C` вызывает `super.method()`, он вызовет метод `method()` из `A`.
//Переменная `a` также будет взята из `A`, так как она не определена в `B`.

//Practice3
class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0);
    }

    public A(int a) {
        this(a, 0, 0);
    }

    public A(int a, int b) {
        this(a, b, 0);
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
}
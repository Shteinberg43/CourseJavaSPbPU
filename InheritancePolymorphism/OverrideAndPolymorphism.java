//practice1
    class Calculator {
        // Метод для сложения двух целых чисел
        public int add(int a, int b) {
            return a + b;
        }

        // Перегруженный метод для сложения трех целых чисел
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Перегруженный метод для сложения двух чисел с плавающей точкой
        public double add(double a, double b) {
            return a + b;
        }

        // Перегруженный метод для сложения целого числа и числа с плавающей точкой
        public double add(int a, double b) {
            return a + b;
        }

        // Перегруженный метод для сложения массива чисел
        public int add(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();

            System.out.println("add(int, int): " + calc.add(3, 4)); // Вызов первого метода
            System.out.println("add(int, int, int): " + calc.add(3, 4, 5)); // Вызов второго метода
            System.out.println("add(double, double): " + calc.add(3.5, 4.5)); // Вызов третьего метода
            System.out.println("add(int, double): " + calc.add(3, 4.5)); // Вызов четвертого метода
            System.out.println("add(int[]): " + calc.add(new int[]{1, 2, 3, 4})); // Вызов пятого метода
        }
    }
    //Practice2
    class Parent {
        public String method() {
            return "Parent";
        }
    }

class Child1 extends Parent {
    @Override
    public String method() {
        return "Child1";
    }
}

class Child2 extends Parent {
    @Override
    public String method() {
        return "Child2";
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        System.out.println(parent.method()); // Вызов метода из класса Parent
        System.out.println(c1.method());   // Вызов переопределенного метода из класса Child1
        System.out.println(c2.method());   // Вызов переопределенного метода из класса Child2
    }
}

// Если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения, то в случае, если это типы возвращаемых значений не являются отнаследованными, то будет ошибка
class Parent {
    public Parent method() {
        return new Parent();
    }
}

class Child1 extends Parent {
    @Override
    public int method() { // Ошибка компиляции
        return 2;
    }
}

class Parent {
    public Parent method() {
        return new Parent();
    }
}

class Child1 extends Parent {
    @Override
    public Child1 method() { // Ошибки нет
        return new Child1();
    }
}

//Practice3
class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    //Использование аннотации `@Override` помогает
    // обнаружить ошибку, если в подклассе метод написан с
    // отличающимся именем или сигнатурой.
    // при неправильном написании имени метода
    // @Override
    // public void eaT() {  // Ошибка, обнаруженная благодаря @Override
    //     System.out.println("Dog eats");
    // }
}
public class Operators {
    //метод для дальнейшего примера
    public static int sum (int[] arr) {
        int result = 0;
        for (int num : arr) {
            result += num;
        }
        return result;
    }
    public static void main(String[] args) {
    //Practice#1
        {
            int x = 10;  // Оператор '='
            System.out.println("x = " + x);

            x += 5; // x = x + 5 -> 15
            System.out.println("x += 5: " + x);

            x -= 3; // x = x - 3 -> 12
            System.out.println("x -= 3: " + x);

            x *= 2; // x = x * 2 -> 24
            System.out.println("x *= 2: " + x);

            x /= 4; // x = x / 4 -> 6
            System.out.println("x /= 4: " + x);

            x %= 5; // x = x % 5 -> 1
            System.out.println("x %= 5: " + x);

            String str = "Hello" + ",";
            str += " world";  // Конкатенация строк
            System.out.println(str);  // Выведет: Hello, world
            //для сравнения строк лучше использовать
            // метод .equals(), так как оператор == сравнивает
            // ссылки, а не содержимое строк.

            int y = 5, z = 10;
            int max = (y > z) ? y : z;  // Если y > z, то max = y, иначе max = z
            System.out.println("Max: " + max);  // Выведет: Max: 10

            boolean a = true, b = false;

            System.out.println("a || b: " + (a || b)); // Логическое ИЛИ: true
            System.out.println("a && b: " + (a && b)); // Логическое И: false
            System.out.println("a | b: " + (a | b));   // Побитовое ИЛИ: true
            System.out.println("a ^ b: " + (a ^ b));   // Побитовое исключающее ИЛИ: true
            System.out.println("a & b: " + (a & b));   // Побитовое И: false

            int q = 10, w = 20;

            System.out.println("q == w: " + (q == w));  // false
            System.out.println("q != w: " + (q != w));
            System.out.println("q > w: " + (q > w));    // false
            System.out.println("q >= w: " + (q >= w));  // false
            System.out.println("q < w: " + (q < w));    // true
            System.out.println("q <= w: " + (q <= w));  // true

            int e = 8;  // 0000 1000 в двоичной системе

            System.out.println("e >> 2: " + (e >> 2));  // Сдвиг вправо на 2: 0000 0010 -> 2
            System.out.println("e >>> 2: " + (e >>> 2)); // Беззнаковый сдвиг вправо: 0000 0010 -> 2
            System.out.println("e << 2: " + (e << 2));  // Сдвиг влево на 2: 0010 0000 -> 32

            int r = 10, t = 3;

            System.out.println("r + t: " + (r + t)); // 13
            System.out.println("r - t: " + (r - t)); // 7
            System.out.println("r * t: " + (r * t)); // 30
            System.out.println("r / t: " + (r / t)); // 3 (целочисленное деление)
            System.out.println("r % t: " + (r % t)); // 1 (остаток от деления)

            int u = 5;

            System.out.println("Префиксный инкремент: " + (++u));  // 6
            System.out.println("Постфиксный инкремент: " + (u++));  // 6 (значение перед инкрементом)
            System.out.println("x после постфиксного инкремента: " + u);  // 7
            System.out.println("Префиксный декремент: " + (--u));  // 6
            System.out.println("Постфиксный декремент: " + (u--));  // 6 (значение перед декрементом)
            System.out.println("x после постфиксного декремента: " + u);  // 5

            int i = 5;  // 0101
            int o = 3;  // 0011

            System.out.println("~i: " + (~i)); // Побитовое НЕ: -6 (в двоичной форме: 1010)
            System.out.println("i & o: " + (i & o)); // Побитовое И: 1
            System.out.println("i | o: " + (i | o)); // Побитовое ИЛИ: 7
            System.out.println("i ^ o: " + (i ^ o)); // Побитовое исключающее ИЛИ: 6
            int[] arr = {1, 2, 3, 4, 5};

            System.out.println("arr[0]: " + arr[0]);  // Доступ к элементу массива, выводит: 1

            // Использование скобок для вызова метода
            int sum = sum(arr);
            System.out.println("Sum: " + sum);  // 15

        }
    //Practice#2
        {
            class Animal {}
            class Dog extends Animal {}
            class Cat extends Animal {}
            Animal dog = new Dog();
            Animal cat = new Cat();

            // Проверка типов объектов с наследованием
            System.out.println("dog instanceof Dog: " + (dog instanceof Dog));  // true
            System.out.println("dog instanceof Animal: " + (dog instanceof Animal));  // true
            System.out.println("cat instanceof Dog: " + (cat instanceof Dog));  // false
            System.out.println("cat instanceof Animal: " + (cat instanceof Animal));  // true
            //Когда оператор instanceof применяется к null, результат всегда будет false,
            // даже если вы проверяете тип на объект, который теоретически может быть этого типа.
            String str = null;
            // Проверка на null
            System.out.println("str instanceof String: " + (str instanceof String));  // false
            // Проверка на null с базовым типом
            Integer num = null;
            System.out.println("num instanceof Integer: " + (num instanceof Integer));  // false
        }
    }
}

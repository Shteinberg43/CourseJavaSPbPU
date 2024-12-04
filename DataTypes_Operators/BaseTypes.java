public class BaseTypes {

    public static void main(String[] args) {
        //Practice#1
        // Целочисленные типы
        {
            byte byteValue = 0;
            byte temperature = -45; // Пример использования
            short shortValue = 0; // Нулевое значение
            short age = 25;     // Пример использования
            int intValue = 0; // Нулевое значение
            int year = 2024;     // Пример использования
            long longValue = 0L; // Нулевое значение
            long bigNumber = 1_000_000L; // long с явным указанием 'L'

            System.out.println("Нулевое значение byte: " + byteValue);
            System.out.println("Температура: " + temperature);
            System.out.println("Нулевое значение short: " + shortValue);
            System.out.println("Возраст: " + age);
            System.out.println("Нулевое значение int: " + intValue);
            System.out.println("Текущий год: " + year);
            System.out.println("Нулевое значение long: " + longValue);
            System.out.println("Большое число: " + bigNumber);

            // Типы с плавающей точкой
            float floatValue = 0.0f; // Нулевое значение
            float temperatureBody = 36.6f; // Пример использования
            double doubleValue = 0.0; // Нулевое значение
            double pi = 3.141592653589793; // Число пи

            System.out.println("Нулевое значение float: " + floatValue);
            System.out.println("Температура тела: " + temperatureBody);
            System.out.println("Нулевое значение double: " + doubleValue);
            System.out.println("Значение π: " + pi);

            // Символьный тип
            char charValue = '\u0000'; // Нулевое значение
            char letter = 'А';          // Пример использования

            System.out.println("Нулевое значение char: [" + charValue + "]");
            System.out.println("Первая буква алфавита: " + letter);

            // Булевский тип
            boolean isActive = false; // Нулевое значение
            boolean isJava = true; // Пример использования

            System.out.println("Нулевое значение boolean: " + isActive);
            System.out.println("Java — это язык? " + isJava);
        }
        //Practice#2

        // Вывод имени "Георгий" с использованием Unicode
        System.out.println("\u0413\u0435\u043E\u0440\u0433\u0438\u0439");
        //Practice#3
        {
            int a = 1;
            {
                int b = 2;
            }
            int c = a + b;
        }
        //Код в текущем виде не компилируется из-за попытки
        // доступа к переменной b вне её области видимости.

        //Переменная b объявлена внутри блока { ... }.
        // Область видимости переменной ограничена этим блоком.
        // После завершения блока переменная b больше не существует,
        // и любая попытка обращения к ней вне блока вызовет ошибку.


        //Practice#4
        {
            class Person {
                String name;
                int age;

                Person(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                // Перегрузка метода toString() для корректного вывода объекта
                @Override
                public String toString() {
                    return name + ", возраст: " + age;
                }
            }
            // Пример с String
            String greeting = "Привет, " + "мир!"; // Конкатенация строк
            System.out.println(greeting);

            // Пример с числовыми типами
            int a = 5;
            double b = 3.14;
            String result = "Сумма: " + (a + b); // Конкатенация строки с базовым типом
            // если написать а+b, то сумма будет равна 53.14, так как будет испльзоваться перегруженный +
            System.out.println(result);

            // Пример с объектами и String
            Person person = new Person("Иван", 25);
            String personInfo = "Информация о человеке: " + person; // Используем перегруженный метод toString()
            System.out.println(personInfo);
        }
        //Practice#5
        {
            byte byteValue = 10;
            int intValue = 20;

            // Операция с разными типами: byte и int
            int result1 = byteValue + intValue; // byte автоматически преобразуется в int
            System.out.println("Результат (byte + int): " + result1); // Результат будет типа int
            //byte + int: Операнд byte автоматически преобразуется в int
            // перед выполнением операции сложения, потому что byte имеет
            // меньший диапазон, чем int

            float floatValue = 3.14f;

            // Операция с разными типами: int и float
            float result2 = intValue + floatValue; // int автоматически преобразуется в float
            System.out.println("Результат (int + float): " + result2); // Результат будет типа float
            //int + float: Операнд int автоматически преобразуется в float,
            // так как float имеет больший диапазон и точность, чем int

            long longValue = 1000L;

            // Операция с разными типами: byte и long
            long result = byteValue * longValue; // byte автоматически преобразуется в long
            System.out.println("Результат (byte * long): " + result); // Результат будет типа long
            //byte * long: Операнд byte автоматически преобразуется в long,
            // так как long имеет больший диапазон, чем byte

        }

    //Practice#6
        {
            int i = 130; // Значение больше максимума для byte (127)

            // Явное преобразование типа int в byte
            byte b = (byte) i; // Потеря данных из-за переполнения
            System.out.println("Преобразованное значение: " + b); // Выведет -126

            double d = 123.456;

            // Явное преобразование типа double в int (отбрасывается дробная часть)
            int k = (int) d; // Потеря данных (дробная часть будет отброшена)
            System.out.println("Преобразованное значение: " + k); // Выведет 123

        }
    //Practice#7
        {
            int a = 120;
            byte b = a + 10;//Ошибка! не произведено явное преобразование при сужении
            byte c = (byte)(a + 10);//c=-126 так как тип byte от -128 до 127, произойдет переполнение
            byte d = a + 1;//не произведено явное преобразование при сужении
            //Если byte d = (byte)(a + 1) - то d=121
        }
    //Practice#8
        {
            interface Animal {
                void sound();
            }

            class Dog implements Animal {
                @Override
                public void sound() {
                    System.out.println("Woof!");
                }
            }

            class Cat implements Animal {
                @Override
                public void sound() {
                    System.out.println("Meow!");
                }
            }
            // Используем var для создания переменной типа Animal
            var animal1 = new Dog();  // Компилятор выводит тип: Dog
            var animal2 = new Cat();  // Компилятор выводит тип: Cat

            // Вызываем методы интерфейса через переменные
            animal1.sound(); // Выведет: Woof!
            animal2.sound(); // Выведет: Meow!
        }
    }
}
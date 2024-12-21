public class Strings {
    //Practice1
    public static void main(String[] args) {
        String str = "Hello, Java World!";

        // 1. length() - возвращает длину строки.
        System.out.println("Length of the string: " + str.length()); // 22

        // 2. toUpperCase() - преобразует строку в верхний регистр.
        System.out.println("Uppercase version: " + str.toUpperCase()); // "HELLO, JAVA WORLD!"

        // 3. toLowerCase() - преобразует строку в нижний регистр.
        System.out.println("Lowercase version: " + str.toLowerCase()); // "hello, java world!"

        // 4. substring(int beginIndex, int endIndex) - извлекает подстроку, начиная с индекса beginIndex и до endIndex.
        System.out.println("Substring from index 7 to 11: " + str.substring(7, 11)); // "Java"

        // 5. charAt(int index) - возвращает символ, находящийся по указанному индексу.
        System.out.println("Character at index 6: " + str.charAt(6)); // ','

        // 6. indexOf(String str) - возвращает индекс первого вхождения подстроки.
        System.out.println("Index of 'Java': " + str.indexOf("Java")); // 7

        // 7. replace(char oldChar, char newChar) - заменяет все вхождения oldChar на newChar.
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0')); // "Hell0, Java W0rld!"

        // 8. trim() - удаляет пробелы с начала и конца строки.
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'"); // "Hello, World!"

        // 9. contains(CharSequence sequence) - проверяет, содержит ли строка указанную последовательность.
        System.out.println("Contains 'Java': " + str.contains("Java")); // true

        // 10. split(String regex) - разбивает строку на массив строк, используя регулярное выражение.
        String[] words = str.split(" "); // Разделение по пробелам
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word); // Выведет: "Hello,", "Java", "World!"
        }

    }
}
//Practice2

// Создание StringJoiner с разделителем ", "
StringJoiner joiner = new StringJoiner(", ");

// Добавление элементов
joiner.add("Apple");
joiner.add("Banana");
joiner.add("Orange");

// Печать объединенной строки
System.out.println(joiner.toString()); // Apple, Banana, Orange

// Создание StringJoiner с разделителем ", ", префиксом "[" и суффиксом "]"
StringJoiner joiner = new StringJoiner(", ", "[", "]");

// Добавление элементов
joiner.add("Red");
joiner.add("Green");
joiner.add("Blue");

// Печать объединенной строки
System.out.println(joiner.toString()); // [Red, Green, Blue]

// Массив строк
String[] fruits = {"Apple", "Banana", "Cherry"};

// Создание StringJoiner с разделителем ", "
StringJoiner joiner = new StringJoiner(", ");

// Добавление элементов из массива
for (String fruit : fruits) {
        joiner.add(fruit)
}

// Печать объединенной строки
        System.out.println(joiner.toString()); // Apple, Banana, Cherry


//Practice3
//Текстовые блоки позволяют писать многострочные строки, содержащие двойные кавычки,
// без использования \n или \" escape-последовательностей:
//Текстовый блок открывается тремя двойными кавычками, """за которыми следует разрыв
// строки, и закрывается тремя двойными кавычками.
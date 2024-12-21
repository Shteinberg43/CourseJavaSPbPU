public class WrapperClass {
    public static void main(String[] args) {
    //Practicе 1
        // Пример с Integer
        System.out.println("Integer (десятичное): " + Integer.decode("42"));      // 42
        System.out.println("Integer (шестнадцатеричное): " + Integer.decode("0x2A")); // 42
        System.out.println("Integer (восьмеричное): " + Integer.decode("052"));     // 42

        //System.out.println(Integer.decode("invalid")); // Ошибка

        // Пример с Byte
        System.out.println("Byte (десятичное): " + Byte.decode("42"));          // 42
        System.out.println("Byte (шестнадцатеричное): " + Byte.decode("0x2A"));   // 42
        System.out.println("Byte (восьмеричное): " + Byte.decode("052"));       // 42
        //System.out.println(Byte.decode("256"));  // Ошибка: 256 не входит в диапазон byte
    //Practicе 2
        // 1. Использование конструктора
        Boolean primitiveValue = true;
        Boolean booleanObject1 = new Boolean(primitiveValue);  // создание через конструктор
        System.out.println("Создание через конструктор: " + booleanObject1);  // true

        // 2. Использование метода valueOf(boolean)
        Boolean booleanObject2 = Boolean.valueOf(primitiveValue);  // создание через valueOf
        System.out.println("Создание через valueOf(boolean): " + booleanObject2);  // true

        // 3. Использование метода valueOf(String)
        String trueString = "true";
        String falseString = "false";
        Boolean booleanObject3 = Boolean.valueOf(trueString);   // создание через valueOf(String)
        Boolean booleanObject4 = Boolean.valueOf(falseString);  // создание через valueOf(String)
        System.out.println("Создание через valueOf(String): " + booleanObject3);  // true
        System.out.println("Создание через valueOf(String): " + booleanObject4);  // false

        // 4. Использование предопределенных значений Boolean.TRUE и Boolean.FALSE
        Boolean booleanObject5 = Boolean.TRUE;  // создание через Boolean.TRUE
        Boolean booleanObject6 = Boolean.FALSE; // создание через Boolean.FALSE
        System.out.println("Создание через Boolean.TRUE: " + booleanObject5);  // true
        System.out.println("Создание через Boolean.FALSE: " + booleanObject6); // false

        // 5. Использование предопределенных значений true, false типа boolean
        Boolean booleanObject7 = true;
        Boolean booleanObject8 = false;
        System.out.println("Создание через автобиоксинг: " + booleanObject7);  // true
        System.out.println("Создание через автобиоксинг: " + booleanObject8);  // false

    //Practice 3
        Integer obj = null; // переменная типа Integer равна null

        // Попытка автоупаковки примитивного типа в объект, который равен null
        obj = null;  // obj остается null

        // Попытка распаковки из null
        //int value = obj;  // Это вызовет NullPointerException (при автораспаковке)

    //Practice 4
    /* - i1 = 128:
      - a1==i1 true
      - b1==i1 true
      - a1==b1 false
    - i2 = 127:
      - a2==i2 true
      - b2==i2 true
      - a2==b2 true

    IntegerCache: кеширует Integer от -128 до 127.
    */
    }
}

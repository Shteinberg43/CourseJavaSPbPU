public class SwitchExample {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        // Пример для примитивного типа int
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x = 1");
                break;
            case 2:
                System.out.println("x = 2");
                break;
            default:
                System.out.println("x не 1 и не 2");
        }

        // Пример для примитивного типа char
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("c = A");
                break;
            case 'B':
                System.out.println("c = B");
                break;
            default:
                System.out.println("c не A и не B");
        }

        // Пример для перечисления (enum)
        Day today = Day.MONDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Сегодня понедельник");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница");
                break;
            default:
                System.out.println("Сегодня не понедельник и не пятница");
        }

        // Пример для строки (String)
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("Это яблоко");
                break;
            case "Banana":
                System.out.println("Это банан");
                break;
            default:
                System.out.println("Не яблоко и не банан");
        }

        // Пример для обертки примитивного типа Integer
        Integer num = 2;
        switch (num) {
            case 1:
                System.out.println("num = 1");
                break;
            case 2:
                System.out.println("num = 2");
                break;
            default:
                System.out.println("num не 1 и не 2");
        }

        // Пример для обертки примитивного типа Character
        Character letter = 'B';
        switch (letter) {
            case 'A':
                System.out.println("letter = A");
                break;
            case 'B':
                System.out.println("letter = B");
                break;
            default:
                System.out.println("letter не A и не B");
        }

        // Пример для примитивного типа byte
        byte b = 10;
        switch (b) {
            case 10:
                System.out.println("b = 10");
                break;
            case 20:
                System.out.println("b = 20");
                break;
            default:
                System.out.println("b не 10 и не 20");
        }

        // Пример для примитивного типа short
        short s = 5;
        switch (s) {
            case 5:
                System.out.println("s = 5");
                break;
            case 10:
                System.out.println("s = 10");
                break;
            default:
                System.out.println("s не 5 и не 10");
        }

        // Пример для обертки примитивного типа Byte
        Byte bObj = 10;
        switch (bObj) {
            case 10:
                System.out.println("bObj = 10");
                break;
            default:
                System.out.println("bObj не 10");
        }

        // Пример для обертки примитивного типа Short
        Short sObj = 5;
        switch (sObj) {
            case 5:
                System.out.println("sObj = 5");
                break;
            default:
                System.out.println("sObj не 5");
        }
    }
}

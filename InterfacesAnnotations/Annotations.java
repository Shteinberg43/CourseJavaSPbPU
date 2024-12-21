 // Аннотация @Override используется для явного указания компилятору, что метод в подклассе переопределяет метод родительского класса

    class Parent {
        public void method() {
            System.out.println("Parent method");
        }
    }

    class Child extends Parent {
        @Override
        public void method() {
            System.out.println("Child method");
        }
    }

    // Аннотация @Deprecated указывает, что метод, класс или поле больше не рекомендуется использовать, так как оно устарело и может быть удалено в будущих версиях.
// Компилятор генерирует предупреждения, если такой элемент используется.
    class OldClass {
        @Deprecated
        public void oldMethod() {
            System.out.println("This is an old method");
        }
    }

    public class Main {
        public static void main(String[] args) {
            OldClass obj = new OldClass();
            obj.oldMethod(); // Предупреждение: использование устаревшего метода
        }
    }

    // Аннотация @SuppressWarnings используется для подавления предупреждений компилятора, которые могут возникать в коде
    public class Main {
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            // Пример использования без предупреждений
            Object obj = new String("Hello");
            String str = (String) obj; // Преобразование типа, которое вызывает предупреждение, но его здесь выключили
            System.out.println(str);
        }
    }


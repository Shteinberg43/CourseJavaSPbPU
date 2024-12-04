// Интерфейс для птиц, которые могут летать
interface Flyable {
    void fly();
}

// Базовый класс
abstract class Bird {
    public abstract void eat();
}

// Летающая птица
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void eat() {
        System.out.println("Я ем зерно");
    }
}

// Нелетающая птица
class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Я ем рыбу");
    }
}

//Классы разделены на летающих и нелетающих птиц.
//Мы избежали нарушения LSP, так как вызов метода fly применим только
// к объектам, которые реализуют интерфейс Flyable.

public class ExampleLSP {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.eat(); // Я ем зерно
        penguin.eat(); // Я ем рыбу

        if (sparrow instanceof Flyable) {
            ((Flyable) sparrow).fly(); // Я лечу!
        }
    }
}

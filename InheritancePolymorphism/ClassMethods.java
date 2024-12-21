//Practice#1
class Superclass {
    public final void finalMethod() {
        System.out.println("Final method in superclass");
    }
}

class Subclass extends Superclass {
    // Попытка переопределения final метода приведет к ошибке компиляции
    // public void finalMethod() {
    //     System.out.println("Attempting to override final method");
    // }
}

//Practice#2
final class FinalClass {
    public void display() {
        System.out.println("Method in final class");
    }
}
// Попытка наследоваться от final класса приведет к ошибке компиляции

 class AnotherClass extends FinalClass {
     public void newDisplay() {
         System.out.println("error");
     }
 }
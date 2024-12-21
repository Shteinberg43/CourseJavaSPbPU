public class PrintVars {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        // Вызов через имя класса
        PrintVars.printVars();

        // Вызов через экземпляр класса
        PrintVars obj = new PrintVars();
        obj.printVars();

        // Вызов из другого статического метода
        printVars();
    }
}

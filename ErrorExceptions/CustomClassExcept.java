// Собственный класс исключений
public class CustomClassExcept extends Exception {
    // Конструктор без параметров
    public CustomClassExcept() {
    }

    // Конструктор от сообщения, которое может быть выведено в поток ошибок и на основе другого исключения
    public CustomClassExcept(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор от сообщения, которое может быть выведено в поток ошибок
    public CustomClassExcept(String message) {
        super(message);
    }

    // Констурктор на основе другого исключения
    public CustomClassExcept(Throwable cause) {
        super(cause);
    }
}
public class StringBuilder {

    public static void main(String[] args) {
    //Practice1
        StringBuffer sbuffer = new StringBuffer("Hello");

        sbuffer.append(" World");
        System.out.println(sbuffer);
        // append(): добавляет строку в конец.

        sbuffer.insert(6, "Java ");
        System.out.println(sbuffer);
        // insert(): вставляет строку в указанную позицию.

        sbuffer.replace(6, 10, "C++");
        System.out.println(sbuffer);
        // replace(): заменяет часть строки с указанных начальных до конечных индексов.

        sbuffer.delete(6, 9);
        System.out.println(sbuffer);
        // delete(): удаляет часть строки от начального до конечного индекса.

        sbuffer.reverse();
        System.out.println(sbuffer);
        // reverse(): переворачивает строку.

        sbuffer.setLength(5);
        System.out.println(sbuffer);
        // setLength(): устанавливает длину буфера.

        System.out.println(sbuffer.capacity());
        // capacity(): возвращает текущую емкость буфера.

        sbuffer.ensureCapacity(50);
        System.out.println(sbuffer.capacity());
        // ensureCapacity(): гарантирует минимальную емкость буфера.

        // Работа со StringBuilder
        StringBuilder sbuilder = new StringBuilder("Cats and Dogs");

        sbuilder.append(" are friends");
        System.out.println(sbuilder);
        // append(): добавляет строку в конец.

        sbuilder.deleteCharAt(4);
        System.out.println(sbuilder);
        // deleteCharAt(): удаляет символ в указанной позиции.

    //Practice2
        // Преобразования между String, StringBuffer и StringBuilder

        // 1. String в StringBuffer
        String str = "Hello";
        StringBuffer sbuffer = new StringBuffer(str);

        // 2. StringBuffer в String
        String strFromBuffer = sbuffer.toString();

        // 3. String в StringBuilder
        StringBuilder sbuilder = new StringBuilder(str);

        // 4. StringBuilder в String
        String strFromBuilder = sbuilder.toString();

        // 5. StringBuffer в StringBuilder и наоборот
        StringBuffer newBuffer = new StringBuffer(sbuilder);
        StringBuilder newBuilder = new StringBuilder(sbuffer);
    }
}

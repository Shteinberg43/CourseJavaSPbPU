public class classObject {
    private int x;

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Рефлексивность
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Сравнение с null или объектом другого класса
        }
        classObject other = (classObject) obj;
        return x == other.x;
    } // Также выполняется симметричность, транзитивность, непротиворечивость, все свойства выполнены
}

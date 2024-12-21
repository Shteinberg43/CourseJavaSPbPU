
    //Practice1
    // Класс, в котором используется инициализация элементов перечисления
    public enum Day {
        MONDAY("Понедельник", 1),
        TUESDAY("Вторник", 2),
        WEDNESDAY("Среда", 3),
        THURSDAY("Четверг", 4),
        FRIDAY("Пятница", 5),
        SATURDAY("Суббота", 6),
        SUNDAY("Воскресенье", 7);

        private final String name;
        private final int dayNumber;

        Day(String name, int dayNumber) {
            this.name = name;
            this.dayNumber = dayNumber;
        }
    }
    //practice2
    public enum UserRole {
        ADMIN("Администратор", 3),
        MODERATOR("Модератор", 2),
        USER("Пользователь", 1),
        GUEST("Гость", 0);

        // Поля для хранения имени роли и уровня доступа
        private final String roleName;
        private final int accessLevel;

        // Конструктор для инициализации полей
        UserRole(String roleName, int accessLevel) {
            this.roleName = roleName;
            this.accessLevel = accessLevel;
        }

        // Дополнительный метод для проверки, есть ли доступ
        public boolean hasAccess(int requiredLevel) {
            return this.accessLevel >= requiredLevel;
        }
    }


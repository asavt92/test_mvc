package view;

public enum Screens {

    MENY("1 - найти книгу" +
            "\n2 - добавить книгу" +
            "\n0 - выход"),
    GREETING("Категорически приветствую!!!" +
            "\nВведите любую строку для продолжения"),
    BYE("До новых встреч!!!"),
    FIND_BOOK_VIEW("1 - поиск по идентификатору" +
            "\n2 - поиск по названию" +
            "\n3 - поиск по году публикации" +
            "\n4 - поиск по жанру" +
            "\n5 - поиск по автору" +
            "\n0 - выход");

    private final String view;

    public String getView() {
        return view;
    }

    Screens(String string) {
        this.view = string;
    }
}

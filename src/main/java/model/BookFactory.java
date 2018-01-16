package model;

public class BookFactory {

    private static BookFactory instance;

    public static BookFactory getInstance() {
        if (instance == null) instance = new BookFactory();
        return instance;
    }

    private BookFactory() {
    }

    public Book createBook(String bookType) {

        switch (bookType) {
            case "TextBook":
                return new TextBook();
            case "AudioBook":
                return new AudioBook();
            default:
                return null;
        }

    }
}

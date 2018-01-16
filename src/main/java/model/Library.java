package model;

import java.util.Set;

public class Library {

    private static Library library;
    private Set<Book> bookSet;
    private Set<Author> authorSet;
    private Set<Genre> genreSet;

    private Library() {
    }

    public static Library getInstance() {
        if (library == null) library = new Library();
        return library;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    public Set<Genre> getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(Set<Genre> genreSet) {
        this.genreSet = genreSet;
    }
}

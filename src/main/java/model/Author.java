package model;

import java.io.Serializable;
import java.util.Set;

public class Author implements Serializable {

    private String name;
    private Long authorId;
    private int yearOfBirthday;
    private Set<Book> bookSet;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Author(String name, Long authorId) {
        this.name = name;
        this.authorId = authorId;
    }

    public Author(String name, Long authorId, int yearOfBirthday) {
        this.name = name;
        this.authorId = authorId;
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (!name.equals(author.name)) return false;
        return authorId.equals(author.authorId);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + authorId.hashCode();
        result = 31 * result + yearOfBirthday;
        return result;
    }
}

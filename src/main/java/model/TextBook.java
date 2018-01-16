package model;

import java.io.Serializable;

public class TextBook implements Book, Serializable {
    private String name;
    private Long id;
    private Integer year;
    private Genre genre;
    private Author author;
    private byte[] data;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public TextBook(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public TextBook(String name, Long id, Integer year, Genre genre, Author author) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.genre = genre;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextBook textBook = (TextBook) o;

        if (!name.equals(textBook.name)) return false;
        if (!id.equals(textBook.id)) return false;
        return author.equals(textBook.author);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", genre=" + genre +
                ", author=" + author +
                '}';
    }
}

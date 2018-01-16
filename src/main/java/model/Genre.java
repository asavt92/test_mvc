package model;

import java.io.Serializable;
import java.util.Set;

public class Genre implements Serializable {

    private  String name;
    private Long genreId;
    private  String annotation;
    private Set<Book> bookSet;

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Genre(String name, Long genreId) {
        this.name = name;
        this.genreId = genreId;
    }

    public Genre(String name, Long genreId, String annotation) {
        this.name = name;
        this.genreId = genreId;
        this.annotation = annotation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getName() {
        return name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        if (!name.equals(genre.name)) return false;
        return genreId.equals(genre.genreId);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + genreId.hashCode();
        return result;
    }
}

package model;

public interface Book {
    String getName();

    void setName(String name);

    Long getId();

    void setId(Long id);

    Integer getYear();

    void setYear(Integer year);

    Genre getGenre();

    void setGenre(Genre genre);

    Author getAuthor();

    void setAuthor(Author author);
}

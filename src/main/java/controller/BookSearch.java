package controller;

import model.Author;
import model.Book;
import model.Genre;

import java.util.List;

public interface BookSearch {
    List<Book> getBookById(Long id);
    List<Book> getBookByName(String name);
    List<Book> getBookByYear(Integer year);
    List<Book> getBookByGenre(Genre genre);
    List<Book> getBookByAuthor(Author author);
}

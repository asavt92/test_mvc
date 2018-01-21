package controller;

import model.Author;
import model.Book;
import model.Genre;
import model.Library;

import java.util.ArrayList;
import java.util.List;

public class BookSearchController implements BookSearch {
    private final Library library;

    public BookSearchController(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    @Override
    public List<Book> getBookById(Long id) {
        List<Book> bookList = new ArrayList<>();
        for (Book book:bookList){
            if (book.getId()==id){
                bookList.add(book);
            }
        }
        return bookList;
    }

    @Override
    public List<Book> getBookByName(String name) {
        return null;
    }

    @Override
    public List<Book> getBookByYear(Integer year) {
        return null;
    }

    @Override
    public List<Book> getBookByGenre(Genre genre) {
        return null;
    }

    @Override
    public List<Book> getBookByAuthor(Author author) {
        return null;
    }
}

package controller;

import model.Genre;

public interface GenreController {
    boolean addGenre(Genre genre);
    boolean removeGenre(Genre genre);
    boolean updateGenre(Long id,Genre genre);
    Genre getGenreById(Long id);
}

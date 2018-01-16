package controller;

import model.Library;
import view.View;

public class LibraryController {

    private final Library library;
    private final View view;

    public LibraryController(Library library, View view) {
        this.library = library;
        this.view = view;
    }
}

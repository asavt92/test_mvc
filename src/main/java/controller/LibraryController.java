package controller;

import model.Library;
import view.ConsoleView;
import view.View;

import java.util.Scanner;

public class LibraryController {

    private final Library library;
    private final View view;
    private BookSearch searchController;

    public LibraryController(Library library, ConsoleView consoleView, BookSearch searchController) {
        this.library = library;
        this.view = consoleView;
        this.searchController = new BookSearchController(library);
    }

    public BookSearch getSearchController() {
        return searchController;
    }
//    public void start(){
//        view.show(Screens.GREETING.getView());
//        getAnswerFromUser();
//        view.clearScreen();
//        view.show(Screens.MENY.getView());
//    }

    /**
     * Метод для обработки ответов пользователя
     */
    private void eatString(String string) {

    }

    public String getAnswerFromUser() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}

package view;

import controller.BookSearch;
import controller.LibraryController;
import model.Book;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View {

    private LibraryController controller;

    public void show(String string) {
        System.out.println(string);
    }

    @Override
    public void clearScreen() {
        try {
            Runtime.getRuntime().exec("cls");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        show(Screens.GREETING.getView());
        controller.getAnswerFromUser();

    }


    public void showStartMenu() {
        show(Screens.MENY.getView());
        switch (controller.getAnswerFromUser().toLowerCase()) {
            case "1": {
                showFindMenu();
            }
            case "2": {

            }
            default:
                System.out.println("Incorrect input");
                controller.getAnswerFromUser();
                clearScreen();
                showStartMenu();
        }
    }

    public void showFindMenu() {
        show(Screens.FIND_BOOK_VIEW.getView());
        switch (controller.getAnswerFromUser().toLowerCase()) {
            case "1": {
                show("Пожалуйста, введите идентификатор");
                BookSearch bookSearch = getController().getSearchController();
                List<Book> list = bookSearch.getBookById(Long.parseLong(getController().getAnswerFromUser()));
                clearScreen();
                System.out.println("Результаты поиска:");
                for (Book book: list){
                    System.out.println(book.toString());
                }
            }
        }
    }

    public void showAddMenu(){

    }

    public LibraryController getController() {
        return controller;
    }
}

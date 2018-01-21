import controller.LibraryController;
import model.Library;
import view.ConsoleView;
import view.View;

public class Mvc {
    private Library library;
    private LibraryController controller;
    private ConsoleView consoleView;

    LibraryController = new LibraryController();

    View view = new ConsoleView();
    view.start();




}

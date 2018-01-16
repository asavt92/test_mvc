package view;

import java.io.IOException;
import java.util.Scanner;

public class View {

    public void updateView(){}

    public void showMenu(){
        System.out.println("1 - найти книгу" +
                "\n2 - добавить книгу" +
                "\nx - выход");
        Scanner in = new Scanner(System.in);
        String inString = in.nextLine();

        switch (inString.charAt(0)){
            case '1': {
                
            }
            case '2':
            case 'e':
        }
    }

    private void cleanScreen() throws IOException {
        Runtime.getRuntime().exec("cls");
    }
}

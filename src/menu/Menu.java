package menu;

import game.Game;
import game.Paragraph;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//класс ресивер
public class Menu {
    public Menu(){}
    public static void exit(){
        System.out.println("Выход");
        System.exit(0);
    }

    public static void startGame(){
        System.out.println("Начать игру");
    }

    public static void downloadGame(){
        System.out.println("Загрузить игру");
        //TODO::загрузка названия параграфа из файла
    }

    public void saveGame(){
        System.out.println("Сохранить игру");
        //TODO:: сохранить название параграфа в файл

    }
}

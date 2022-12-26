import game.Game;
import menu.Menu;
import menu.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Command downloadGame = new DownloadGame(menu);
        Command exit = new Exit(menu);
        Command saveGame = new SaveGame(menu);
        Command startGame = new StartGame(menu);

        Switch invoker = new Switch(exit, saveGame,startGame,downloadGame);

        System.out.println("0. Выход \n" +
                "1. Начать игру \n" +
                "2. Загрузить игру \n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input == 0){
            invoker.exit();
        }
        else if (input == 1){
            invoker.StartGame();
            Game.paragraph("Лисенок");

        } else if (input == 2) {
            invoker.downloadGame();
            System.out.println(Menu.downloadedParagraph);
            Game.paragraph(Menu.downloadedParagraph);
        }


        System.out.println("0. Выход \n" +
                "1. Начать игру \n" +
                "2. Загрузить игру \n" +
                "3.Сохранить игру");
        Scanner in2 = new Scanner(System.in);
        int input2 = in2.nextInt();
        if (input2 == 0) {
            invoker.exit();
        } else if (input2 == 1) {
            invoker.StartGame();
            Game.paragraph("Лисенок");

        } else if (input2 == 2) {
            invoker.downloadGame();


        } else if (input2 == 3) {
            invoker.saveGame();
        }
    }
}

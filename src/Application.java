import game.Game;
import game.Paragraph;
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

            Paragraph paragraph1 = new Paragraph("Лисенок");
            Game.paragraph(paragraph1.getParagraphName());

        } else if (input == 2) {
            invoker.downloadGame();
        }




    }
}

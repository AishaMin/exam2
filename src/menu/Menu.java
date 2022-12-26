package menu;

import game.Game;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//класс ресивер
public class Menu {
    public static String downloadedParagraph;
    public Menu(){}
    public static void exit(){
        System.out.println("Выход");
        System.exit(0);
    }

    public static void startGame(){
        System.out.println("Начать игру");
    }

    public static void downloadGame(){
        Path path = Paths.get("continue.txt");

        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String str = new String(bytes, StandardCharsets.UTF_8);
        downloadedParagraph = str;
    }



    public void saveGame(){
        System.out.println("Сохранить игру");
        try (FileWriter writer = new FileWriter("continue.txt", false);){
            writer.write(Game.needForSaveParagraph.getParagraphName());
            writer.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

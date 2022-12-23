package menu;

import menu.Command;
import menu.Menu;

public class StartGame implements Command {
    private Menu theMenu;

    public StartGame(Menu theMenu) {
        this.theMenu = theMenu;
    }

    @Override
    public void execute() {
        theMenu.startGame();
    }
}


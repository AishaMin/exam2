package menu;

public class SaveGame implements Command {
    private Menu theMenu;

    public SaveGame(Menu theMenu) {
        this.theMenu = theMenu;
    }

    @Override
    public void execute() {
        theMenu.saveGame();
    }
}



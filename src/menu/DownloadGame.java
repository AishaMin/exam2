package menu;

public class DownloadGame implements Command {
    private Menu theMenu;

    public DownloadGame(Menu theMenu) {
        this.theMenu = theMenu;
    }

    @Override
    public void execute() {
        theMenu.downloadGame();
    }
}

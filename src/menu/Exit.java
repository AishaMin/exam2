package menu;

import menu.Command;

public class Exit implements Command {
    private Menu theMenu;

    public Exit(Menu theMenu) {
        this.theMenu = theMenu;
    }

    @Override
    public void execute() {
        theMenu.exit();
    }
}
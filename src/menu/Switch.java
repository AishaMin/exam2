package menu;

public class Switch {
    private Command exitCommand;
    private Command saveGameCommand;
    private Command startGameCommand;
    private Command downloadGameCommand;

    public Switch(Command exitCommand, Command saveCommand, Command startCommand, Command downloadCommand) {
        this.exitCommand = exitCommand;
        this.saveGameCommand = saveCommand;
        this.startGameCommand = startCommand;
        this.downloadGameCommand = downloadCommand;
    }

    public void  downloadGame (){
        downloadGameCommand.execute();
    }
    public void  exit (){
        exitCommand.execute();
    }
    public void  saveGame (){
        saveGameCommand.execute();
    }
    public void  StartGame (){
        startGameCommand.execute();
    }
}

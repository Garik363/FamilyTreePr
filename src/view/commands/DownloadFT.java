package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class DownloadFT extends Command {
    public DownloadFT(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Загрузить дерево из файла";
    }

    @Override
    public void execute() {
        try {
            consoleUI.download();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

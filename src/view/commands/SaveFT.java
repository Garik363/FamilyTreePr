package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class SaveFT extends Command{
    public SaveFT(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Сохранить дерево в файл";
    }

    @Override
    public void execute() {
        try {
            extracted();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void extracted() throws IOException {
        consoleUI.save();
    }

}


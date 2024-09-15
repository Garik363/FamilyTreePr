package view.commands;

import view.ConsoleUI;

public class GetInfoFT extends Command{
    public GetInfoFT(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Показать семейное дерево";
    }

    @Override
    public void execute() {
        consoleUI.getFamilyTreeinfo();
    }
}

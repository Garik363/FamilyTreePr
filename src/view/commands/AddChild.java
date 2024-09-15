package view.commands;


import view.ConsoleUI;

public class AddChild extends Command{
    public AddChild(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Добавить ребёнка в семейное дерево";
    }

    @Override
    public void execute() {
        consoleUI.addChild();
    }

}
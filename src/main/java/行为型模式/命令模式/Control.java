package 行为型模式.命令模式;

import 行为型模式.命令模式.command.command;

public class Control {
    public void CommandExecution(command c){
        c.execute();
    }
    public void CommandUndo(command c){
        c.undo();
    }
}

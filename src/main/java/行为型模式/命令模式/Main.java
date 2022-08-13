package 行为型模式.命令模式;

import 行为型模式.命令模式.command.TurnOfLight;
import 行为型模式.命令模式.object.Light;

public class Main {
    public static void main(String[] args) {
        Control control = new Control();
        Light L = new Light();
        control.CommandExecution(new TurnOfLight(L));
        control.CommandUndo(new TurnOfLight(L));
    }
}

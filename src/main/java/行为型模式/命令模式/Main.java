package 行为型模式.命令模式;

import 行为型模式.命令模式.command.TurnOfLight;
import 行为型模式.命令模式.object.Light;

public class Main {
    public static void main(String[] args) {
        Control control = new Control();    //控制单元
        Light L = new Light();  //对象
        control.CommandExecution(new TurnOfLight(L));   //传入命令
        control.CommandUndo(new TurnOfLight(L));
    }
}

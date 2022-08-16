package 行为型模式.命令模式.command;

import 行为型模式.命令模式.object.Light;

public class TurnOfLight implements command{
    private final Light light;

    public TurnOfLight(Light light) {
        this.light = light;
    }   //命令需接收被执行的类

    @Override
    public void execute() {
        light.off();
    }   //执行命令

    @Override
    public void undo() {
        light.on();
    }   //反向执行命令
}

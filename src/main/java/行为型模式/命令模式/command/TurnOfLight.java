package 行为型模式.命令模式.command;

import 行为型模式.命令模式.object.Light;

public class TurnOfLight implements command{
    private final Light light;

    public TurnOfLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

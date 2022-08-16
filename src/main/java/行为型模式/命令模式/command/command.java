package 行为型模式.命令模式.command;

public interface command {  //命令接口
    void execute();
    void undo();
}

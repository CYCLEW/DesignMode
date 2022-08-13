package 行为型模式.状态模式.state;

import 行为型模式.状态模式.Player;

public class PlaceA implements state{

    private Player context;

    public PlaceA(Player context) {
        this.context = context;
    }

    @Override
    public void stop() {
        System.out.println("A停止");
    }

    @Override
    public void move() {
        System.out.println("A准备移动");
        context.setState(context.onMove);
        context.setDirection("onMove");
    }
}

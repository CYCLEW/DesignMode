package 行为型模式.状态模式.state;

import 行为型模式.状态模式.Player;

public class OnMove implements state{

    private Player context;

    public OnMove(Player context) {
        this.context = context;
    }

    @Override
    public void stop() {
        System.out.println("在移动");
    }

    @Override
    public void move() {
        System.out.println("移动路上");
        context.setState(context.placeB);
    }
}

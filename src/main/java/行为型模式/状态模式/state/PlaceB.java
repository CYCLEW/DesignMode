package 行为型模式.状态模式.state;

import 行为型模式.状态模式.Player;

public class PlaceB implements state{

    private Player context;

    public PlaceB(Player context) {
        this.context = context;
    }

    @Override
    public void stop() {
        System.out.println("B停止");
    }

    @Override
    public void move() {
        System.out.println("去A");
        context.setState(context.placeA);
        context.setDirection("A");
    }
}

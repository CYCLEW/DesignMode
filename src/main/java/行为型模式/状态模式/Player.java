package 行为型模式.状态模式;


import 行为型模式.状态模式.state.OnMove;
import 行为型模式.状态模式.state.PlaceA;
import 行为型模式.状态模式.state.PlaceB;
import 行为型模式.状态模式.state.state;

public class Player {

    public state placeA;
    public state placeB;
    public state onMove;
    private state state;
    private String direction;
    public Player() {
        direction="A";
        placeA=new PlaceA(this);
        placeB=new PlaceB(this);
        onMove=new OnMove(this);
        this.state=placeA;
    }

    public void move(){
        state.move();
    }

    public void stop(){
        state.stop();
    }
    public void setState(state s){
        this.state=s;
    }
    public void setDirection(String s){
        this.direction = s;
    }
}

package 行为型模式.备忘录模式;

import 行为型模式.备忘录模式.memory.Memento;
import 行为型模式.备忘录模式.memory.memory;

public class Originator {
    private String state;   //状态

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento(){
        return new Memento(state);
    }   //以状态类保存

    public String getStateFromMemento(memory memento){
        return ((Memento) memento).getState();
    }
}

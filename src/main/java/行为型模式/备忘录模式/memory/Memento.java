package 行为型模式.备忘录模式.memory;

public class Memento implements memory{
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

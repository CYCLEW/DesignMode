package 行为型模式.中介者模式.Object;

import 行为型模式.中介者模式.Mediator.mediator;

public abstract class object {
    protected mediator mediator;
    protected String name;

    public object(String name) {
        this.name=name;
    }
    public void setMedium(mediator mediator){
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void Send(String to,String ad);
    public abstract void receive(String from,String ad);
}

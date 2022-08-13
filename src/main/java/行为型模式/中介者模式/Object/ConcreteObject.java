package 行为型模式.中介者模式.Object;

public class ConcreteObject extends object{
    public ConcreteObject(String name) {
        super(name);
    }

    @Override
    public void Send(String to, String ad) {
        mediator.relay(name,to,ad);
    }

    @Override
    public void receive(String from, String ad) {
        System.out.println(name+"接收到"+from+"的消息"+ad);
    }
}

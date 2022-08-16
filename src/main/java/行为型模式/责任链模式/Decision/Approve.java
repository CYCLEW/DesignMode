package 行为型模式.责任链模式.Decision;

public abstract class Approve { //责任链处理类接口
    protected Approve successor;
    String Name;
    public Approve(String name){
        this.Name = name;
    }
    public abstract void ProcessRequest(PurchaseRequest request);
    public void setSuccessor(Approve a){
        this.successor = a;
    }
}

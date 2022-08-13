package 行为型模式.责任链模式.Decision;

public abstract class Approve {
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

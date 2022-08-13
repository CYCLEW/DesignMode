package 行为型模式.责任链模式.Decision;

public class PurchaseRequest {
    private int ID = 0;

    public PurchaseRequest(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

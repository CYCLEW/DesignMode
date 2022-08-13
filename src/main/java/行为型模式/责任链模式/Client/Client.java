package 行为型模式.责任链模式.Client;

import 行为型模式.责任链模式.Decision.PurchaseRequest;

public class Client {
    public Client() {
    }
    public PurchaseRequest sendRequest(int ID){
        return new PurchaseRequest(ID);
    }
}

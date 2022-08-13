package 行为型模式.责任链模式.Decision.Object;

import 行为型模式.责任链模式.Decision.Approve;
import 行为型模式.责任链模式.Decision.PurchaseRequest;

public class MasterApprove extends Approve {


    public MasterApprove(String name) {
        super(name+"MasterApprove");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if (request.getID()==0){
            System.out.println("Master 处理消息");
        }else{
            successor.ProcessRequest(request);
        }
    }
}

package 行为型模式.责任链模式.Decision.Object;

import 行为型模式.责任链模式.Decision.Approve;
import 行为型模式.责任链模式.Decision.PurchaseRequest;

public class DepartmentApprove extends Approve {


    public DepartmentApprove(String name) {
        super(name+"DepartmentApprove");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if (request.getID()==1){
            System.out.println("Depart 处理消息");
        }else{
            successor.ProcessRequest(request);
        }
    }
}

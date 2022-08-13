package 行为型模式.责任链模式.Decision.Object;

import 行为型模式.责任链模式.Decision.Approve;
import 行为型模式.责任链模式.Decision.PurchaseRequest;

public class GroupApprove extends Approve {


    public GroupApprove(String name) {
        super(name+"GroupApprove");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        System.out.println("Group 处理消息");
    }
}

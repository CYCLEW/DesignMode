package 行为型模式.责任链模式;

import 行为型模式.责任链模式.Client.Client;
import 行为型模式.责任链模式.Decision.Approve;
import 行为型模式.责任链模式.Decision.Object.DepartmentApprove;
import 行为型模式.责任链模式.Decision.Object.GroupApprove;
import 行为型模式.责任链模式.Decision.Object.MasterApprove;

public class Main {
    public static void main(String[] args) {
        Client c=new Client();

        Approve m=new MasterApprove("master");
        Approve d=new DepartmentApprove("depart");
        Approve g=new GroupApprove("group");

        m.setSuccessor(d);
        d.setSuccessor(g);

        m.ProcessRequest(c.sendRequest(0));
        m.ProcessRequest(c.sendRequest(1));
        m.ProcessRequest(c.sendRequest(2));
        m.ProcessRequest(c.sendRequest(3));
    }
}

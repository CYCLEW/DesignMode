package 行为型模式.责任链模式;

import 行为型模式.责任链模式.Client.Client;
import 行为型模式.责任链模式.Decision.Approve;
import 行为型模式.责任链模式.Decision.Object.DepartmentApprove;
import 行为型模式.责任链模式.Decision.Object.GroupApprove;
import 行为型模式.责任链模式.Decision.Object.MasterApprove;

public class Main {
    public static void main(String[] args) {
        Client c=new Client();  //客户都安

        Approve m=new MasterApprove("master");      //实例化责任链对象
        Approve d=new DepartmentApprove("depart");
        Approve g=new GroupApprove("group");

        m.setSuccessor(d);  //创建责任链 m->d->g
        d.setSuccessor(g);

        m.ProcessRequest(c.sendRequest(0)); //发送请求
        m.ProcessRequest(c.sendRequest(1));
        m.ProcessRequest(c.sendRequest(2));
        m.ProcessRequest(c.sendRequest(3));
    }
}

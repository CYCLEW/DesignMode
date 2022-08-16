package 行为型模式.策略模式;

import 行为型模式.策略模式.AL.Strategy;

public class Environment {  //策略处理工厂
    private Strategy s;
    public Environment(Strategy s){
        this.s=s;
    }
    public int calculate(int a,int b){
        return s.calc(a,b);
    }
}

package 行为型模式.策略模式;

import 行为型模式.策略模式.AL.ADD;
import 行为型模式.策略模式.AL.SUB;

public class Main {
    public static void main(String[] args) {
        Environment e1 = new Environment(new ADD());
        System.out.println(e1.calculate(3,4));
        Environment e2 = new Environment(new SUB());
        System.out.println(e2.calculate(3,4));
    }
}

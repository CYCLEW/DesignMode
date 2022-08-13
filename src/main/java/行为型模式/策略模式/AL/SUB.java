package 行为型模式.策略模式.AL;

public class SUB implements Strategy{
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}

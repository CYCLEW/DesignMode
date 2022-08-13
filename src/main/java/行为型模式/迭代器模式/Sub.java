package 行为型模式.迭代器模式;

public class Sub {
    private final String name;
    public Sub(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sub{" +
                "name='" + name + '\'' +
                '}';
    }
}

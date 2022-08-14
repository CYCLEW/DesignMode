## 建造者模式

---
### 建造者模式指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示。


 **AbstractFactory 抽象工厂接口** \

---
Computer 需要建造的初始类

ComputerBuilder 对初始类的处理接口
MyComputerBuilder 自己创建的处理流程

Director 类处理器
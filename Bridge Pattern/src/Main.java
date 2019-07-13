/*
* 桥梁模式(桥接模式)：将抽象和实现解耦，使得两者可以独立地变化。
* */
public class Main {
    public static void main(String[] args){
        Implementor imp = new ConcreteImplementor1();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.request();
    }
}

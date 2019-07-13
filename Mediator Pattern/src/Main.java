/*
* 中介者模式：用一个中介对象封装一系列对象的交互，中介者使各对象不需要显示地相互作用，
* 从而使其耦合松散，而且可以独立地改变它们之间的交互。
* */
public class Main {
    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        colleague1.depMethod();
    }
}

/*
* 观察者模式(发布订阅模式)：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，
* 则所有依赖于它的对象都会得到通知并被自动更新。
* */
public class Main {
    public static void main(String[] args){
    /*    ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject .doSomething();*/
        ConcreteSubject2 concreteSubject2 = new ConcreteSubject2();
        Observer2 observer2 = new Observer2();
        concreteSubject2.addObserver(observer2);
        concreteSubject2.doSomething();
    }
}

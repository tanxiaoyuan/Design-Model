package classadapter;

public class ConcreteTarget implements Target {
    @Override
    public void doSomething() {
        System.out.println("ConcreteTarget do something...");
    }
}

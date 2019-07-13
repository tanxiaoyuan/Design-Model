package classadapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void doSomething() {
        super.request();
    }
}

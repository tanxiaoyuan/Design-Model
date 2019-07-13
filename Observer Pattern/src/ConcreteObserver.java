public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Notice has been received...");
    }
}

package virualproxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题...");
    }
}

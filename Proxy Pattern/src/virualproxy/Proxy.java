package virualproxy;

public class Proxy implements Subject {
    private Subject subject;
    @Override
    public void request() {
        if(subject == null){
            subject = new RealSubject();
        }
        subject.request();
    }
}

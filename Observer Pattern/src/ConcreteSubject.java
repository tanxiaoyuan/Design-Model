public class ConcreteSubject extends Subject {
    public void doSomething(){
        System.out.println("ConcreteSubject do something...");
        super.notifyObservers();
    }
}

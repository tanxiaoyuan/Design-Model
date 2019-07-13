import java.util.Observable;

public class ConcreteSubject2 extends Observable {

    public void doSomething(){
        super.setChanged();
        this.notifyObservers("ConcreteSubject2 do something...");
    }
}

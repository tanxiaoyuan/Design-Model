package multistatus;

public class Main {
    public static void main(String[] args){
        Originator originator = new Originator();
        Memento memento = originator.getMemento();
        originator.restoreMemento(memento);

    }
}

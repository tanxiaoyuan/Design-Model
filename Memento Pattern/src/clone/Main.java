package clone;

public class Main {
    public static void main(String[] args){
        Originator originator = new Originator();
        Originator backup = originator.createMemento();
        originator.restoreMemento(backup);
    }
}

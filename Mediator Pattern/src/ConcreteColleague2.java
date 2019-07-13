public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod(){
        System.out.println("ConcreteColleague2 do something...");
    }
}

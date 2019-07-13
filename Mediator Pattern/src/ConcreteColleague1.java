public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public  void selfMethod(){
        System.out.println("ConcreteColleague1 do something...");
    }

    public void depMethod(){
        super.mediator.doSomething2();
    }
}

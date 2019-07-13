public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        super.getColleague1().selfMethod();
    }

    @Override
    public void doSomething2() {
        super.getColleague1().selfMethod();
        super.getColleague2().selfMethod();
    }
}

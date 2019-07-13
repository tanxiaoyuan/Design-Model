public abstract class Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public Mediator(){
        colleague1 = new ConcreteColleague1(this);
        colleague2 = new ConcreteColleague2(this);
    }

    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }
    public abstract void doSomething1();
    public abstract void doSomething2();
}

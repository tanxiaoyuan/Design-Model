public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        System.out.println("ConcreteState1 do something...");
    }

    @Override
    public void handle2() {
        this.context.setCurrentState(Context.STATE2);
        super.context.handle2();

    }
}

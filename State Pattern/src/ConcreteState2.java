public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        this.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState2 do something...");
    }
}

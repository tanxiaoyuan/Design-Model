public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("ConcreteElement1 do something...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

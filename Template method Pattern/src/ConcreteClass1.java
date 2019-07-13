public class ConcreteClass1 extends AbstractClass {

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private boolean flag;
    @Override
    protected void doSomething() {
        System.out.println("Class1 do something...");
    }

    @Override
    protected void doAnything() {
        System.out.println("Class1 do anything...");
    }

    @Override
    public boolean isDoAnything(){
        return this.flag;
    }
}

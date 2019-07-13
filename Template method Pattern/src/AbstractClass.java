public abstract class AbstractClass {
    protected abstract void doSomething();
    protected abstract void doAnything();
    protected boolean isDoAnything(){
        return true;
    }
    public  final void templateMethod(){
        if(isDoAnything()){
            doAnything();
        }
        doSomething();
    }
}

public abstract class Abstraction {
    private Implementor imp;
    public Abstraction(Implementor imp){
        this.imp = imp;
    }
    public void request(){
        this.imp.doAnything();
    }
    public Implementor getImp(){
        return imp;
    }
}

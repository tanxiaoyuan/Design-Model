public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }
    @Override
    public void request(){
        /*
        * 业务逻辑
        * */
        super.request();
        super.getImp().doAnything();
    }
}

/*
* 状态模式：当一个对象内在状态改变时允许其改变行为，这个对象看起来像是改变了其类。
* */
public class Main {
    public static void main(String[] args){
        Context context = new Context();
        context.setCurrentState(new ConcreteState2());
        context.handle1();
        context.handle2();
    }
}

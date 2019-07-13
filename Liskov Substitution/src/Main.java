import java.util.HashMap;
/*
* 里式替换原则：只要父类能够出现的地方子类就可以出现，而且替换为子类也不会出现任何错误和异常，
* 使用者可能根本不需要知道是父类还是子类。但是，子类出现的地方，父类未必能够适应。
* 1. 子类必须完全实现父类的方法
* 2. 子类可以有自己的个性
* 3. 重载或者实现父类方法时输入参数范围可以放大
* 4. 复写或者实现父类方法时输出结果范围可以被缩小
* */
public class Main {
    public static void main(String[] args){
        Father father = new Father();
        HashMap map = new HashMap();
        Son son = new Son();
        son.doSomething(map);
    }
}

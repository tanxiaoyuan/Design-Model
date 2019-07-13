/*
*抽象工厂模式：为创建一组相关或者相互依赖的的对象提供一个接口，而且无需指定它们的具体类。
*
* */
public class Main {
    public static void main(String[] args){
        AbstractProductA productA = new Creator1().createProductA();
    }

}

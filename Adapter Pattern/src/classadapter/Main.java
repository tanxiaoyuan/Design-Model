package classadapter;
/*
*类适配器：将一个类的接口变换成客户端所期待的另一种接口，
* 从而使原本因接口不匹配而无法在一起工作的两个类可以一起工作。
* */
public class Main {

    public static void main(String[] args){
        Target target = new Adapter();
        target.doSomething();
    }
}

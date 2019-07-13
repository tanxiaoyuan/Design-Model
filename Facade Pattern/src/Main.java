/*
* 门面模式：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行，
* 门面模式提供一个高层次的接口，使得子系统更易于使用。
* */
public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methodA();
    }
}

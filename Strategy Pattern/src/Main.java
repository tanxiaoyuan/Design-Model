/*
* 策略模式：定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。
* */
public class Main {
    public static void main(String[] args){
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
        System.out.println(Calculator.ADD.exec(1,3));
    }
}
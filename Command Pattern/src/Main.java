/*
* 命令模式：一种高内聚模式，将一个请求封装为一个对象，从而让你使用不同的请求把客户端参数化，
* 对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
* */
public class Main {
    public static void main(String[] args){
        Receiver receiver = new ConcreteReceiver2();
        Command command = new ConcreteCommand1(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}

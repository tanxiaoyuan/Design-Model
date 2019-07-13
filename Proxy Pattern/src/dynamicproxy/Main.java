package dynamicproxy;
/*
* 动态代理：动态代理在实现阶段不必关心代理谁，而在运行阶段才指定代理哪个对象。
* 其中invoke方法是接口InvocationHandler定义必须实现的，它完成对真实方法的调用。
* 通过InvocationHandler接口，所有方法都由该Handler来进行处理，即所有被代理的
* 方法都由InvocationHandler接管实际的处理任务。
* */
public class Main {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething();
    }
}

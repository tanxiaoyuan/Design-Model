package dynamicproxy;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("执行前置通知...");
    }
}

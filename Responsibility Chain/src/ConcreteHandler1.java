public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.FIRST;
    }

    @Override
    protected Response echo() {
        System.out.println("ConcreteHandler1 echo...");
        return null;
    }
}

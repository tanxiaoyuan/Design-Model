public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.THREE;
    }

    @Override
    protected Response echo() {
        System.out.println("ConcreteHandler3 echo...");
        return null;
    }
}

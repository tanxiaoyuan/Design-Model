public class ConcreteHandler2 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.SECOND;
    }

    @Override
    protected Response echo() {
        System.out.println("ConcreteHandler2 echo...");
        return null;
    }
}

public class Phone implements IConnectionManager, IDataTransfer {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("拨打电话...");
    }

    @Override
    public void hangUp() {
        System.out.println("挂断电话...");
    }

    @Override
    public void transferData(IConnectionManager connectionManager) {
        System.out.println("通话中...");
    }
}

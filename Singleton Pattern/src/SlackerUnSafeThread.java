/*
* 优点：起到了lazy loading的效果，但是只能在单线程的情况下使用。
* 缺点：如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
* 另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
*
* */
public class SlackerUnSafeThread {
    private static SlackerUnSafeThread instance;
    private SlackerUnSafeThread(){}
    public static SlackerUnSafeThread getInstance(){
        if(instance == null){
            instance = new SlackerUnSafeThread();
        }
        return instance;
    }
}

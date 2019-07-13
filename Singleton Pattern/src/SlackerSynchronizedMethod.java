/*
* 优点：通过加锁对getInstance()方法进行了线程同步，最终多线程情况下只有一个实例。
* 缺点：每次去获取实例都需要等待其他线程将锁释放，严重影响效率。
* */
public class SlackerSynchronizedMethod {
    private static SlackerSynchronizedMethod instance;
    private SlackerSynchronizedMethod(){}
    public static synchronized SlackerSynchronizedMethod getInstance(){
        if(instance == null){
            instance = new SlackerSynchronizedMethod();
        }
        return instance;
    }
}

/*
* 在实例化的时候加入了同步锁，但是效果还是和SlackerUnSafeThread一样，在多线程情况下
* 还是会产生多个实例。
* */
public class SlackerSynchronizedCode {
    private static SlackerSynchronizedCode instance;
    private SlackerSynchronizedCode(){}
    public static SlackerSynchronizedCode getInstance(){
        if(instance == null){
            synchronized(SlackerSynchronizedCode.class){
                instance = new SlackerSynchronizedCode();
            }
        }
        return instance;
    }

}

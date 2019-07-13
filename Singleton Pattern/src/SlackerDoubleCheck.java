/*
* 双重检测进行了两次检测，保证线程安全性，最终只产生一个实例。
* */
public class SlackerDoubleCheck {
    private static SlackerDoubleCheck instance;
    private SlackerDoubleCheck(){}
    public static SlackerDoubleCheck getInstance(){
        if(instance == null){
            synchronized(SlackerDoubleCheck.class){
                if(instance == null){
                    instance = new SlackerDoubleCheck();
                }
            }
        }
        return instance;
    }
}

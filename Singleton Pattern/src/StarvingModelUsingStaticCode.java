/*
* 缺点和优点与使用静态常量一样。
* */
public class StarvingModelUsingStaticCode {
    private static StarvingModelUsingStaticCode instance;
    private StarvingModelUsingStaticCode(){}
    static{
        instance = new StarvingModelUsingStaticCode();
    }
    public static StarvingModelUsingStaticCode getInstance(){
        return instance;
    }
}

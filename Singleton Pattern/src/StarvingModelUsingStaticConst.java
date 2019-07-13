/*
* 优点：写法简单，在类装载的时候就完成实例化，避免线程同步问题。
* 缺点：在类初始化的时候就完成实例化，没有达到Lazy Loading的效果，如果该实例没有使用，则会造成内存浪费。
* */
public class StarvingModelUsingStaticConst {
        private static final StarvingModelUsingStaticConst INSTANCE = new StarvingModelUsingStaticConst();
        private StarvingModelUsingStaticConst(){}
        public static StarvingModelUsingStaticConst getInstance(){
            return INSTANCE;
    }
}

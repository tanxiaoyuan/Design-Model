/*
* 构造函数注入
* */
public class Driver2 implements IDriver2 {
    private ICar car;
    public Driver2(ICar car){
        this.car = car;
    }
    @Override
    public void drive() {
        this.car.run();
    }
}

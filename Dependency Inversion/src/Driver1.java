/*
* 接口声明注入
* */
public class Driver1 implements IDriver1 {
    @Override
    public void drive(ICar car) {
        car.run();
    }
}

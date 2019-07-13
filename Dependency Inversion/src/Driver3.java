/*
* Setter方法传递依赖对象
* */
public class Driver3 implements IDriver3 {
    private ICar car;
    @Override
    public void setCar(ICar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        this.car.run();
    }
}

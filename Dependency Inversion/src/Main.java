/*
* 依赖倒置原则：
* 高层模型不应该依赖底层模块，两者都应该依赖其抽象；
* 抽象不应该依赖细节；
* 细节应该依赖抽象。
* 依赖的三种写法：
* 1. 构造函数传递依赖对象
* 2. Setter方法传递依赖对象
* 3. 接口声明传递依赖对象
* */
public class Main {
    public static void main(String[] args){
        IDriver1 driver1 = new Driver1();
        ICar car = new Benz();
        driver1.drive(car);
        IDriver2 driver2 = new Driver2(new Benz());
        driver2.drive();
        IDriver3 driver3 = new Driver3();
        driver3.setCar(new Bmw());
        driver3.drive();
    }
}

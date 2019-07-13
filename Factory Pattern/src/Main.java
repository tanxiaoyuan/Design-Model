/*
* 工厂模式：定义一个用于创建对象的接口，让子类决定实例化哪个类。
* 工厂方法使一个类的实例化延迟到其子类。
*
* */
public class Main {
    public static void main(String[] args){
        Product product = new ConcreteCreator().create(Product1.class);
        product.method();
    }
}

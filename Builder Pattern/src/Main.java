/*
* 建造者模式(生成器模式)：将一个复杂对象的创建和表示分离，使得同样的构建过程可以创建不同的表示
*
* */
public class Main {
    public static void main(String[] args){
        Director director = new Director();
        director.getProduct();
    }
}

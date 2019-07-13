/*
* 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。
* 使得子类可以不改变算法结构即可重定义算法的某些特定步骤。
*
* */
public class Main {
    public static void main(String[] args){
        AbstractClass class1 = new ConcreteClass1();
        ((ConcreteClass1) class1).setFlag(true);
        class1.templateMethod();
    }

}

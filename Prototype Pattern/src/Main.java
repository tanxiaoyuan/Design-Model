/*
* 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
* */
public class Main {
    public static void main(String[] args){
        Thing thing1 = new Thing();
        try {
            Thing thing2 = thing1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

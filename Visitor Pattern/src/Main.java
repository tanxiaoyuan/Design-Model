/*
* 访问者模式：封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下
* 定义作用于这些元素的新的操作。
*
* */
public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            Element el = ObjectStructure.createElement();
            el.accept(new Visitor());
        }
    }
}

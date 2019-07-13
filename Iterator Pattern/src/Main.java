/*
* 迭代器模式：提供一种方法访问一个容器对象中各个元素，而不需要暴露该对象的内部细节。
* */
public class Main {
    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        Iterator iterator = aggregate.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

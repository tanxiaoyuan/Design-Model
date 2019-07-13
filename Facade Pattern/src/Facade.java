public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void methodA(){
        this.a.doSomething();
    }
    public void methodB(){
        this.b.doSomething();
    }
    public void methodC(){
        this.c.doSomething();
    }
}

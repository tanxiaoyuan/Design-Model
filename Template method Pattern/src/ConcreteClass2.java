public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        templateMethod();
        System.out.println("Class2 do something...");
    }

    @Override
    protected void doAnything() {
        System.out.println("Class2 do anything...");
    }
}

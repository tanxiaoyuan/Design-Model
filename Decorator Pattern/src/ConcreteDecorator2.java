public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    @Override
    public void operate(){
        super.operate();
        operate1();
    }
    private void operate1(){
        System.out.println("ConcreteDecorator2 do something...");
    }
}

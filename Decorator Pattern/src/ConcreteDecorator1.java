public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    @Override
    public void operate(){
        super.operate();
        operate1();
    }
    private void operate1(){
        System.out.println("ConcreteDecorator1 do something...");
    }
}

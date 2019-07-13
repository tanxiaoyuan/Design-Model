public class Director {
    private Builder builder = new ConcreteBuilder();
    public Product getProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}

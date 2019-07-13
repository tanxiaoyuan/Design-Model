public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T create(Class<T> clazz) {
        Product product = null;
        T productT = null;
        try {
            product  = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(product != null){
            productT = (T)product;
        }
        return productT;
    }
}

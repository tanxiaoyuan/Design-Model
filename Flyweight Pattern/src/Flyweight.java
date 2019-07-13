public abstract class Flyweight {
    private String intrinsic;
    protected final String  extrinsic;
    public String getIntrinsic() {
        return intrinsic;
    }
    public abstract void operate();
    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
    public Flyweight(String extrinsic){
        this.extrinsic = extrinsic;
    }

}

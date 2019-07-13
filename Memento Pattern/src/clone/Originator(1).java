package clone;

public class Originator implements Cloneable{
    private String state = "";
    public String getState() {
        return state;
    }
    public void setState(String state){
        this.state = state;
    }

    @Override
    public Originator clone(){
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Originator createMemento(){
        return this.clone();
    }
    public void restoreMemento(Originator originator){
        this.setState(originator.getState());
    }
}

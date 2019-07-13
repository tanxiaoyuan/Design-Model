import java.util.ArrayList;
import java.util.List;

public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();
    @Override
    public Thing clone() throws CloneNotSupportedException {
        Thing thing = (Thing)super.clone();
        thing.arrayList = (ArrayList<String> )this.arrayList.clone();
        return thing;
    }
}

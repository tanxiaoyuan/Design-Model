import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();
    @Override
    public void add(Object object) {
        this.list.add(object);
    }

    @Override
    public void remove(Object object) {
        this.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.list);
    }
}

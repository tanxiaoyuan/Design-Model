import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    private List list;
    private int cursor = 0;
    public ConcreteIterator(List list){
        this.list = list;
    }
    @Override
    public Object next() {
        Object result;
        if(this.hasNext()){
            result = this.list.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.list.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.list.remove(this.cursor);
        return true;
    }
}

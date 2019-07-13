import java.util.*;

public class Son extends Father {

    public Collection doSomething(Map map) {
        System.out.println("Son do something...");
        return map.values();
    }

    @Override
    public List doSomething(HashMap map) {
        System.out.println("Son do something...");
        return new ArrayList(map.values());
    }

}


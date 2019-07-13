import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<>();
    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight = null;
        if(pool.containsKey(extrinsic)){
            flyweight =  pool.get(extrinsic);
        }else{
            flyweight = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}

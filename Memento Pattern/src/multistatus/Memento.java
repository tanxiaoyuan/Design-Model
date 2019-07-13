package multistatus;

import java.util.HashMap;

public class Memento {
    private HashMap<String, Object> stateMap;
    public Memento(HashMap<String, Object> stateMap){
        this.stateMap = stateMap;
    }
    public HashMap<String, Object> getStateMap(){
        return this.stateMap;
    }
    public void setStateMap(HashMap<String, Object> stateMap){
        this.stateMap = stateMap;
    }
}

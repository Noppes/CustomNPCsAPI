package noppes.npcs.api.function;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventWrapper<T> {
    private final Map<String, T> events = new HashMap<>();

    public void add(String id, T event){
        if(event == null){
            events.remove(id);
        }
        else{
            events.put(id, event);
        }
    }

    public boolean has(String id){
        return events.containsKey(id);
    }

    public T get(String id){
        return events.get(id);
    }

    public T remove(String id){
        return events.remove(id);
    }

    public String[] keys(){
        return events.keySet().toArray(String[]::new);
    }

    public Collection<T> values(){
        return events.values();
    }
}

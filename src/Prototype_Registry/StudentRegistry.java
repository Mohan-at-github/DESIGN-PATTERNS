package Prototype_Registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map=new HashMap<>();


    public  void register(String key, Student student){
        map.put(key, student);
    }
    public Student getObject(String key){
       return map.get(key);
    }
}

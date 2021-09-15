package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class newHashMap {
    public static void main(String [] args) {
        Map <Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "A");
        map.put(101, "A");
        map.put(102, "C");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        
        HashMap <Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");
        hashMap.put(4, "PHP");
        System.out.println(hashMap);
        Set <Integer> set = hashMap.keySet();
        for(Integer key : set ) {
            System.out.println(key + hashMap.get(key));
        }
        Iterator<Integer> itr = hashMap.keySet().iterator();
        while(itr.hasNext()) {
            System.out.println(hashMap.get(itr.next()));
        }
    }

}



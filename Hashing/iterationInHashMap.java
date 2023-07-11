import java.util.*;
import java.util.HashMap;

public class iterationInHashMap {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();
        //insert TC - O(1)
        hm.put("India", 140);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonessia", 6);
        hm.put("Nepal", 5);

        //iterate 
       for(String key: hm.keySet()) {
        System.out.println(key);
       }
    }

}

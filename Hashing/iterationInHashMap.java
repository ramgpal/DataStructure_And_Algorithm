import java.util.*;
import java.util.HashMap;

public class iterationInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //insert TC - O(1)
        hm.put("India", 140);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonessia", 6);
        hm.put("Nepal", 5);

        //iterate 
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k +",value = "+hm.get(k));
        }
    }

}

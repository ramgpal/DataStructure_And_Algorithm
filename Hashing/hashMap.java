import java.util.*;
public class hashMap {
      public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //insert TC - O(1)
        hm.put("India", 140);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //get O(1)
        System.out.println(hm.get("India"));

        //contains O(1)
        System.out.println(hm.containsKey("Indonessia"));  // Indonessia exist in map or not?

        //remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //to get size of map
        System.out.println(hm.size());

     }
}

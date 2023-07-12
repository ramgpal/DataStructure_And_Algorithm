import java.util.*;
public class FindIntineraryFromTickets {
    public static String getStart( HashMap<String, String> tickets) {
         HashMap<String, String> tickets2 = new HashMap<>();
         for(String key: tickets.keySet()) {
            tickets2.put(tickets.get(key), key);
         }
         for(String key: tickets.keySet()) {
            if(!tickets2.containsKey(key)) {
                return key;
            } 
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        //starting point
        String start = getStart(tickets);
        System.out.print(start);
        for(String key: tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}

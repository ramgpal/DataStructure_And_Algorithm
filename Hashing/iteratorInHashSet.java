import java.util.*;
public class iteratorInHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Gurugram");
        cities.add("Noida");
        cities.add("Kanpur");

        // a -> iterator
        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

       // b -> enhance for loop
       for(String city: cities) {
        System.out.println(city);
       }
    }
}

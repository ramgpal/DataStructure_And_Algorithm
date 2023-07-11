// sorted in ascending order, null values is not allowed
import java.util.*;
public class Set {
    public static void main(String[] args) {

    //HashSet -> unordered, unique, null allowed
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Gurugram");
        cities.add("Noida");
        cities.add("Kanpur");
        System.out.println(cities);

    //LinkedHashSet -> ordered, unique & null is allowed
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Gurugram");
        lhs.add("Noida");
        lhs.add("Kanpur");
        System.out.println(lhs);

    // TreeSet -> sorted in ascending order, null value is not allowed
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Gurugram");
        ts.add("Noida");
        ts.add("Kanpur");
        System.out.println(ts);
    }
}

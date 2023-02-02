import java.util.ArrayList;
public class operations {
public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
    //Add  TC-O(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);

    //Get element TC-O(1)

System.out.println(list.get(1));

//Remove element TC-O(n)

list.remove(2);
System.out.println(list);

//Set element
list.set(2,3);
System.out.println(list);
}
}

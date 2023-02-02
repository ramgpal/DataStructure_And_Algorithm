import java.util.ArrayList;
public class ReverseOfArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       for(int i=list.size()-1;i>=0;i--) {
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
}
}

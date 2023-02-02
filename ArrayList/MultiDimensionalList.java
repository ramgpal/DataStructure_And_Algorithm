import java.util.*; 
public class MultiDimensionalList {
    public static void main(String[] args)  {
        ArrayList <ArrayList<Integer>> MainList=new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
    for(int i=1;i<=5;i++) {
        list1.add(i*1);   //1,2,3,4,5
        list2.add(i*2);   //2,4,6,8,10
        list3.add(i*3);   //3,6,9,12,15
    }
  MainList.add(list1);
  MainList.add(list2);
  MainList.add(list3);

  System.out.println(MainList+" ");
    }
}

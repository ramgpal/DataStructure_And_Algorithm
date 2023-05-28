import java.util.*;
public class FractionalKnapshop {
  public static void main(String [] args) {
    int value[] = {60, 100, 120};
    int [] weight = {10, 20, 30};
    int capacity = 50;
    double ratio[][] = new double[value.length][2];
    for(int i=0;i<value.length;i++) {
        ratio[i][0] = i;

        ratio[i][1] = value[i]/(double)(weight[i]);
    }
    Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
    int val = 0;
    for(int i = ratio.length-1 ;i>=0;i--) {
      int index = (int)ratio[i][0];
        if(capacity >= weight[index]) {
          val += value[index];
          capacity -= weight[index];
        }
        else {
            val += (ratio[i][1]*capacity);
            capacity = 0;
            break;
        }
    }
    System.out.println(val);
  }  
}

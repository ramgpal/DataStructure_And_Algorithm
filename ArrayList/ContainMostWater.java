//Brute force approach with Tie complexity O(n^2)
import java.util.*; 
public class ContainMostWater {
    public static int Most_Water(ArrayList<Integer> height) {
        int MaxWater=0;
        for(int i=0;i<height.size();i++) {
            for(int j=i+1;j<height.size();j++) {
                int temp = Math.min(height.get(i),height.get(j)); // for height : considered mim
                int width = j-i;    
                int CurrentArea = temp*width;
                MaxWater = Math.max(CurrentArea,MaxWater);
            }
        }
            return MaxWater;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
       System.out.println(Most_Water(height));
    }
}
//2.0ptimized solution with TC-O(n) Two pointer approach
/* public static int Most_Water(ArrayList<Integer> height) {
    int MaxWater=0;
    for(int i=0,j=height.size()-1;i<j;) {
            int temp = Math.min(height.get(i),height.get(j)); // for height : considered mim
            int width = j-i;    
            int CurrentArea = temp*width;
            MaxWater = Math.max(CurrentArea,MaxWater);
        if(height.get(i)<height.get(j)) {
            i++;
        }
        else
        j--;
        }
        return MaxWater;
}
}
 */


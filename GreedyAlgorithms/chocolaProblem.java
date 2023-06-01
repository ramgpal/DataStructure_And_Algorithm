import java.util.*;
public class chocolaProblem {
   public static void main(String[] args) {
    int n = 4;  //Row
    int m = 6; //Column
    Integer costHorizantal[] = {4, 1, 2};  // length row-1 ke equal hogi
    Integer costVerticle[] = {2,1,3,1,4};  // length column-1 ke equal hogi
    Arrays.sort(costHorizantal, Comparator.reverseOrder()); 
    Arrays.sort(costVerticle, Comparator.reverseOrder()); 
    int h =0, v = 0;  // iterator
    int hp = 1; //taking count of horizantal pieces
    int vp = 1; //taking count of verticle pieces
    int cost = 0;
    while(h < costHorizantal.length && v < costVerticle.length) {
        // case1 - vertical cost < horizantal cost
        if(costVerticle[v] <= costHorizantal[h]) {  // horizantal cut lgao
            cost += (costHorizantal[h]*vp);
            h++;
            hp++;
        }
        //verticle cut lgao
        else {
                cost += (costVerticle[v]*hp);
                v++;
                vp++;
            }
        }
        // yadi kuch remaining rah jate kyonki yeah ho sakta hain rows aur columns equal numbers me nn ho
        while(h<costHorizantal.length) {
            cost += (costHorizantal[h]*vp);
            h++;
            hp++;
        }
        while(v<costVerticle.length) {
            cost += costVerticle[v]*hp;
            v++;
            vp++;
        }
        System.out.println("Minimum costs of cuts are : "+ cost);
        }
}

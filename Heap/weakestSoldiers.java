import java.util.*;
public class weakestSoldiers {
    public static class Row implements Comparable<Row> {
        int countSoldiers; // number of 1's in army are number of soldiers
        int idx;
       public Row(int countSoldiers, int idx) {
            this.countSoldiers = countSoldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2) {
            if(this.countSoldiers == r2.countSoldiers) {
                return this.idx - r2.idx;
            }
            else {
                return this.countSoldiers - r2.countSoldiers;
            }
        }
    }
    public static void main(String[] args) {
        int [][] army = {
                         {1, 0, 0, 0},
                         {1, 1, 1, 1},
                         {1, 0, 0, 0},
                         {1, 0, 0, 0}
                        };
                        int k = 2;
       PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i =0;i<army.length;i++) {
            int count = 0;
            for(int j = 0; j<army[0].length;j++) {
                if(army[i][j] == 1) {
                    count += 1;
                }
                else {
                    count += 0;
                }
            }
                pq.add(new Row(count, i));
            }
            for(int i =0;i<k;i++) {
                System.out.println("R"+pq.remove().idx);
            }
        }

}



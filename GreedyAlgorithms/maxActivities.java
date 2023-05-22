import java.util.*;
public class maxActivities {
    public static void main(String[] args) {
       int[] start = {2, 6, 4, 1, 4, 2, 3};
       int[] end = {4, 10, 9, 9, 4, 5, 4};

// sorting process if end[] isn't given sorted

       int activities[][] = new int[start.length][3];
       for(int i=0;i<start.length;i++) {
        activities[i][0] = i;
        activities[i][1] = start[i];
        activities[i][2] = end[i];
       }
       Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));


       int maxAct = 0;
       ArrayList<Integer> ans = new ArrayList<>();
       // 1st activities 
       maxAct = 1;
       ans.add(0);   //ans.add(Activities[0][0])
       int lastEnd = end[0]; //lastEnd = Activities[0][2];
       for(int i=1;i<start.length;i++) {
        //choose activity when -> startTime >= endTime of last activity
         if(start[i] >= lastEnd) {  // if(Activities[i][1] >= lastEnd)
            //select activity
            ans.add(i);   //ans.add(Activities[i][0]);
            maxAct++;
            lastEnd  = end[i];   // lastEnd = Activities[i][2];
         }
       }
       System.out.println(maxAct);
       for(int i=0;i<ans.size();i++) {
       System.out.print("A"+ans.get(i)+" ");
     }
     System.out.println();
}
}
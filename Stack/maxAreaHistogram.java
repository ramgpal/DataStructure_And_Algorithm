import java.util.*;
public class maxAreaHistogram {
    public static void main(String[] args) {
        int height [] ={2,1,5,6,2,3};
        int maxArea = 0;
        Stack <Integer> s = new Stack<>(); //index stack of array
        int nextSmallerRight[] = new int[height.length];
        int nextSmallerLeft[] = new  int[height.length];

        //nextSmallerRight[]
        for(int i=height.length-1;i>=0;i--) {
            //while
        while(!s.isEmpty() && height[s.peek()] >= height [i]) {
         s.pop();
        }
        //if-else
        if(s.isEmpty()) {
            nextSmallerRight[i] = height.length;
        }
        else {
            nextSmallerRight[i] = s.peek();
        }
        //push in s
          s.push(i);
        }
       
        //next Smaller Left
        s = new Stack<>();
        for(int i=0;i<height.length;i++) {
            //while
        while(!s.isEmpty() && height[s.peek()] >= height [i]) {
         s.pop();
        }
        //if-else
        if(s.isEmpty()) {
            nextSmallerLeft[i] = -1;
        }
        else {
            nextSmallerLeft[i] = s.peek();
        }
        //push in s
          s.push(i);
        }

        //current area = j-i-1 = nextSmallerRight[i]-nextSmallerLeft[i]-1
        for(int i=0;i<height.length;i++) {
          int h = height[i];  //height oof histogram
          int width = (nextSmallerRight[i]-nextSmallerLeft[i]-1);
          int currArea = h*width;
          maxArea = Math.max(currArea, maxArea);
        }
     System.out.println("max area in histogram = "+maxArea);  
    }
}
import java.util.*;
public class Next_Generator {
    public static void main(String[] args) {
        int arr [] ={1,2,1};
        Stack <Integer> s = new Stack<>(); //index stack of array
        int result[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            //while
        while(!s.isEmpty() && arr[s.peek()] <=arr [i]) {
         s.pop();
        }
        //if-else
        if(s.isEmpty()) {
            result[i]=-1;
        }
        else {
            result[i] = arr[s.peek()];
        }
        //push in s
          s.push(i);
        }
        for(int i=0;i<result.length;i++) {
          System.out.print(result[i]+" "); 
        }
    }
}
//next greater right
//next greater left
//next smaller right
//next smaller right

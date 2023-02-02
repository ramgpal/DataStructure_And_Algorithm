import java.util.*;
public class Subsets {
    public static void Find_Subsets(String str,String ans,int index) {
        //Base
if(index==str.length()) {
    if(ans.length()==0){
     System.out.println("NULL");   
    }
    else {
System.out.println(ans);
}
return;
}
//Recursive aproach
//choice Yes
Find_Subsets(str, ans+str.charAt(index), index+1);
//Choice No
Find_Subsets(str, ans, index+1); 
}
public static void main (String[] args) {
    String str="abc";
    String ans="";
    Find_Subsets(str, ans, 0);
}
}
//Time Complexity O(n*2^n)
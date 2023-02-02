//sum of first n natural nos
import java.util.*;
public class SumOfNos {
    public static void main(String[] args) {
       int n=5;
        int sum=0;
        while(n>0) {
            sum=sum+n;
            n--;
        }
    System.out.println(sum);
}
}
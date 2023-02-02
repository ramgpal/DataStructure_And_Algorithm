import java.util.*;
public class PrimeNos {
    public static boolean IsPrime(int n) {
        if(n==2 || n==1) {
            return true;
        }
        for(int i=2;i<n;i++) {
            if(n%i!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(IsPrime(6));
    }
}

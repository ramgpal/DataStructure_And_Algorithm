// Bit Manipulation 
import java.util.*;
public class BitManipulation {
    // 1. Get ith bit
    public static int GetIthBit(int n,int i) {
        int bitmask=1<<i;
        if((n&bitmask)==0) {
        return 0;
    }
    else
    return 1;
    }
    // 2. to check odd or even
    public static boolean OddOrEven(int n) {
        int bitmask=1;
        if((n&bitmask) == 0) {
            return true;
        }
        else
        return false;
    }
    // 3. set ith bits
    public static int SetIthBit(int n,int i) {
        int bitmask=1<<i;
        return (n|bitmask);
    }
    // 4. clear ith bit
    public static int ClearIthBit(int n,int i) {
       int bitmask=~(1<<i);
       int ans=(n&bitmask);
       return ans; 
	}
	// 5. Clear Bits in range
    public static int ClearBitsInRange(int n,int i,int j) {
       int a=((~0)<<j+1);
       int b=(1<<i)-1;
       int bitmask=a|b;
       return n&bitmask; 
	}
	// 6. clear last i Bits
    public static int ClearLastBits(int n,int i) {
	    int BitMask=(-1)<<i;
	    return n & BitMask;
	}
	// 7. To count set bits in a given Number
	public static int CountSetBits(int n) {
	    int count=0;
	    while(n>0) {
	        if((n & 1) != 0) {
	            count++;
	        }
	        n=n>>1;
	        
	    }
	    return count;
	}
	// 8. Fast Exponentiation
	public static int FastExponentiation(int a, int n) {
	    int ans=1;
	    while(n>0) {
	        if((n & 1)!=0) {
	        ans=ans*a;
	    }
	    a=a*a;
	    n = n>>1;
	}
	return ans;
	}
	//driver  code
	public static void main(String[] args) {
	    //Get Ith Bit
	  System.out.println(GetIthBit(10, 2));  
	   //OddOrEven
	  System.out.println(OddOrEven(4));    
	   //SetIthBit
	  System.out.println(SetIthBit(10, 2));           
	    //ClearBitsInRange
	  System.out.println(ClearBitsInRange(10,2,4));  
         //ClearLastBits
	  System.out.println(ClearLastBits(15,2));       
        //ClearIthBit
	  System.out.println(ClearIthBit(10, 1));
         //CountSetBits
	  System.out.println(CountSetBits(10));
       //FastExponentiation
      System.out.println(FastExponentiation(3,4));
	}
}

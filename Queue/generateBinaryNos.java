import java.util.*;
public class generateBinaryNos {
    public static void printBinary(int N) {
        Stack<Integer> s = new Stack<>();
        int i = 2;
        while(N != 1) {
            s.push(N%i);
            N = N/i;
        }
        s.push(1);
    while(!s.isEmpty()) {
     System.out.print(s.peek());
     s.pop();
    }
    System.out.print(" ");
    }
    public static void main(String[] args) {
        int N = 5;
        for(int i = 1;i<=N;i++) {
            printBinary(i);
        }
    }
}

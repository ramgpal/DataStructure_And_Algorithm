public class Print1ToN {
    public static void print(int N, int count) {
        if(count > N) {
            return;
        }
        System.out.println(count);
        print(N, count + 1);
    }

    // print N to 1 recursively
    public static void printNTo1(int N) {
        if( N <= 0) {
            return;
        }
        System.out.println(N);
        printNTo1(N-1);
    }

    // print 1 to N backtracking
    public static void print1ToN(int N) {
        if(N <= 0) {
            return;
        }
        print1ToN(N - 1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        // print(10, 1);
        // printNTo1(5);
        print1ToN(5);
    }
}

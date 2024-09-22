public class Fib {
    public static int nthFibonacci(int n) {
        if(n <= 1) {
            return n;
        }

        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(5));
    }
}

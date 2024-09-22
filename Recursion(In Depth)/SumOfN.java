class SumOfN{
    static int Sum = 0;
    public static int sum(int n) {
        if(n <= 0) {
            return 0;
        }
        sum(n-1);
        Sum += n;
        return Sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
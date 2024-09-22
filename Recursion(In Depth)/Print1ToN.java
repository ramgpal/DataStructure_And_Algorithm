public class Print1ToN {
    public static void print(int N, int count) {
        if(count > N) {
            return;
        }
        System.out.println(count);
        print(N, count + 1);
    }
    public static void main(String[] args) {
        print(10, 1);
    }
}

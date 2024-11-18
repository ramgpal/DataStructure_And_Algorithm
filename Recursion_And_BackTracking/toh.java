public class toh {
    public static int TOH(int n, int A, int B, int C) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            System.out.println("Move disk " + n + " from rod " + A + " to rod " + B);
            return 1;
        }

        int count = 0;
        count += TOH(n - 1, A, C, B);
        System.out.println("Move disk " + n + " from rod " + A + " to rod " + B);
        count += 1;
        count += TOH(n - 1, C, B, A);

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Total moves: " + TOH(2, 1, 2, 3));
    }
}

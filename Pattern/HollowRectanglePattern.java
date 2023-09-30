public class HollowRectanglePattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= 5; j++) { // columns
                if(i == 1 || i == 4 || j== 1 || j == 5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}

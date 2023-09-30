public class StarPattern {
    public static void main(String[] args) {
        int n = 4;
         /*
            *
            **
            ***
            ****
        */
        for(int i = 1; i <= n; i++) { // line
            for(int j = 1; j <= i; j++) { // star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

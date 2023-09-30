public class Special {
    public static void main(String[] args) {
        int n = 4;
        char chCapital = 'A';
        char chSmall = 'a';
        int count = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                count++;
                if(count % 2 == 0) {
                    System.out.print(chCapital);
                }
                else {
                    System.out.print(chSmall);
                }
                
                chCapital++;
                chSmall++;
            }
            System.out.println();
        }
    }
}

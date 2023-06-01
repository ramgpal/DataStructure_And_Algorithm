import java.util.*;
public class indianCoin {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,500,2000};
        int amount = 590;
        int count = 0;
        Arrays.sort(coin, Comparator.reverseOrder());   
        for(int i = 0; i<coin.length;i++) {
            if(coin[i] <= amount ) {
                while(coin[i] <= amount) {
                count++;
                amount -= coin[i];
            }
        }
    }
    System.out.println(count);
}
}
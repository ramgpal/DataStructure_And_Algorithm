    //Tilling problem & pairing friends recursive appproach
    public class TowerOfHanoi {
    //Recursion problem 10 - Goldman satches
    public static int PairingFriends(int n) {
        if(n==1 || n==2) {
            return n;
        }
        /* //choices
        //single
        int fn1=PairingFriends(n-1);
      //pair ways
        int fn2=(n-1)*PairingFriends(n-2);
        //Total ways
      int TotalWays=fn1+fn2; */
      return PairingFriends(n-1)+(n-1)*PairingFriends(n-2);
    }
    //Recursion Problem 11
    public static  int Tilling_Problem(int n) {
        if(n==0 || n==1) {
            return 1;
        }
       /* //for verticle 
        int f1=Tilling_Problem(n-1);
        //for horizantal
        int f2=Tilling_Problem(n-2);
        //total ways to tilr floor
        int TotalWays=f1+f2; */
        return Tilling_Problem(n-1)+Tilling_Problem(n-2);
    }
    public static void main(String[] args) {
        //Function calling 10
        System.out.println(PairingFriends(3));
        //function calling 11
        System.out.println(Tilling_Problem(4));
    }
}


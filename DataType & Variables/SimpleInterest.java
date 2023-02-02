import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int r=S.nextInt();  //interest rate
        int t=S.nextInt();   //time
        int p=S.nextInt();  //principal money
     int s = (p*r*t)/100;
     System.out.println("simple interest is: "+s+"rs");
}
}

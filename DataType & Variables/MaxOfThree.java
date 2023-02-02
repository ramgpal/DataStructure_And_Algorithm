public class MaxOfThree {
    public static void main(String[] args) {
        int a=7,b=5,c=12;
       if(a>b) {
        if(a>c) {
        System.out.println("a is greatest among a,b & c: "+a);
       }
       else  
       System.out.println("c is greatest among a,b & c: "+c);
    }
    else {
        if(b>c) {
            System.out.println("b is greatest among a,b & c: "+b);
        }
        else
        System.out.println("c is greatest among a,b & c: "+c);
    }
    }
}

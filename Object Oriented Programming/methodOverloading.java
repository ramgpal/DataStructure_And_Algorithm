import java.util.*;
public class methodOverloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum(1.1, 2.3));
        System.out.println(calc.sum(1, 2, 3));
    }
   
}

// compile-time polymorphism -> multiple functions with same name but diff params
class calculator{
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
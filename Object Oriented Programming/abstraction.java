import java.util.*;
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    void eat() {
        System.out.println("can eat");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

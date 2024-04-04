public class methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// Having same functions with different definition
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat() {
        System.out.println("eats grass");
    }
}
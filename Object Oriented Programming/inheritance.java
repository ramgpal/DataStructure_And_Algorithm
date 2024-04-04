public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breaths();
        shark.swims();
    }
}

// Base class
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }
    
    void breaths() {
        System.out.println("breaths");
    }
}

// derived class
class Fish extends Animal{
    int fins;

    void swims() {
        System.out.println("Swims in water");
    }
}

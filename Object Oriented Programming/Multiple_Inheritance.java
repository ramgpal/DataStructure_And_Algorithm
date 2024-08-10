public class Multiple_Inheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eat();
    }
}

interface Harnivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Harnivore, Carnivore {
    @Override
    public void eatPlants() {
        System.out.println("Bear is eating plants.");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear is eating meat.");
    }

    public void eat() {
        eatPlants();
        eatMeat();
    }
}

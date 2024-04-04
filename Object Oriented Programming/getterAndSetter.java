public class getterAndSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        System.out.println("Color: " + p1.getColor());

        p1.setTip(5);
        System.out.println("Tip: " + p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    public String getColor() {
        return this.color; // This keyword is used to refer current object
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

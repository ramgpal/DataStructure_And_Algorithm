public class classesAndObjects{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // craeted a Pen object p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calcPercantage(54, 34, 97);
        System.out.println(s1.percantage);
    }
}

    // in OOPS class is the group of obje cts. In other words classes are the blueprint or prototype from which objects are created
    class Pen{
        // properties
        String color;
        int tip;

        // behaviour
        void setColor(String newColor) { 
            color =  newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    class Student{
        String name;
        int age;
        float percantage;
        void calcPercantage(int phy, int math, int chem) {
            percantage = (phy + math + chem)/3;
        }
    }


public class ClassAndObject {

    public static void main(String[] args) {
        //2-[OBJECT]:Creation of Object using Pen class

        Pen p1 = new Pen(); //created a pen object called p1

        p1.setColor("red"); //using p1 object we are setting the color of pen
        System.out.println(p1.color);

        p1.setTip(4);
        System.out.println(p1.tip);

     // Another way to set color and tip
        p1.color = "yellow";
        System.out.println(p1.color);

        p1.tip = 7;
        System.out.println(p1.tip);
    }
}

//1-[CLASS]:Creation of class(Pen){Blueprint of the class}
class Pen {
//Properties

    String color;
    int tip;

//Methods/fn
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

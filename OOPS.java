public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen(); //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
    }
}
class Pen{
    // properties+function
    String color;
    int tip;
     void setColor(String newColor){
        color = newColor;
     }
     void setTip(int newTip)
{
tip=newTip;
}     
}
class Student{
    String name;
    int age;
    float percentage;
    void calculatePercentage( int phy,int chem,int math){
percentage=phy+chem+math/3;
    }
}
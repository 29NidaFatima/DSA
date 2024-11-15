public class OOPS {

    public static void main(String[] args) {
        // // OBJECT
        Pen p1= new Pen(); //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        //// Bank Account object
        BankAccount myAcc = new BankAccount(); // here myAcc is a object
myAcc.username="Nida Fatima";
myAcc.setpassword("abc");
    }
}
//  // CLASS
class Pen{
    // properties+function
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
     }
     void setTip(int newTip){
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

////ACCESS MODIFIERS
 class BankAccount{
public String username;
private String password;
public void setpassword(String pwd){
    password=pwd;
}
}
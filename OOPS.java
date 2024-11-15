public class OOPS {

    public static void main(String[] args) {
        // OBJECT
        Pen p1 = new Pen(); // Created a Pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip()); // used the getter method to print the tip value
        p1.setColor("Yellow"); // changed the color
System.out.println(p1.getColor());
        //// Bank Account object
        // BankAccount myAcc = new BankAccount(); // Created a BankAccount object called myAcc
        // myAcc.username = "Nida Fatima";
        // myAcc.setPassword("abc"); // called the `setPassword` method
    }
}

// CLASS
class Pen {
    // Properties + functions
    private String color;
    private int tip;

    // Getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // Setters
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

// // ----Student Class----
// class Student {
//     String name;
//     int age;
//     float percentage;

//     void calculatePercentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3.0f; // Fixed: Corrected the formula to compute average correctly
//     }
// }

// // ACCESS MODIFIERS
// class BankAccount {
//     public String username;
//     private String password;

//     public void setPassword(String pwd) { // Fixed: Method name should follow Java naming conventions
//         this.password = pwd;
//     }
// }

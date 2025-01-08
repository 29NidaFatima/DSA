public class OOPS {

  public static void main(String[] args) {
    // OBJECT
    Pen p1 = new Pen(); // Created a Pen object called p1
    p1.setColor("blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip()); // used the getter method to print the tip
    // value
    p1.setColor("Yellow"); // changed the color
    System.out.println(p1.getColor());
    // Bank Account object
    BankAccount myAcc = new BankAccount(); // Created a BankAccount object called
    myAcc.username = "Nida Fatima";
    myAcc.setPassword("abc"); // called the `setPassword` method
    // Student object

    Student s1= new Student();
    // Student s2= new Student("Nida");
    // Student s3=new Student(0)
    s1.name="nida";
    s1.roll=456;
    s1.password="abcd";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;

    Student s2=new Student(s1);
    s2.password="xyz";
    for(int i=0; i<3;i++){
    System.out.println(s2.marks[i]);
    }

    
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

// ACCESS MODIFIERS
class BankAccount {
  public String username;
  private String password;

public void setPassword(String pwd) { // Fixed: Method name should follow
Java naming conventions
this.password = pwd;
}
}

// ----Student Class----
class Student {
  String name;
  int roll;
  String password;
  int marks[];

  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

Student() {
marks=new int[3]
System.out.println("constructor is called...");
}

Student(String name) { // construcor
marks=new int[3]
this.name = name;
}

Student(int roll) {
marks=new int[3]
this.roll = roll;
}
}


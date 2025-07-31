
public class CopyConstructor {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Nida";
        s1.roll = 170;
        s1.pass = "abcd";

        s1.marks[0] = 98;
        s1.marks[1] = 99;
        s1.marks[2] = 100;

        //for some reason s1 object forget their password then go towards to make another object and copy all properties of s1 object, by passing as argument in object s2
        Student s2 = new Student(s1);
        s2.pass = "xyz";
        s1.marks[2]=84;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }

    }
}

class Student {

    String name;
    int roll;
    String pass;
    int marks[];

// Shallow copy constructor
    // // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;

    // }

    //Deep copy constructor
    Student(Student s1) {
             marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
          for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
            
        }
    }
    Student (){
        System.out.println("constructor is called");
    }

}


public class Constructor {

    public static void main(String[] args) {
        // if we do not pass any argument(Non paramerterized Constructor)
                Student s1 = new Student();
                // paramerterized Constructor
        Student s2 = new Student("Nida");
        System.out.println(s2.name);
        
    }
}

class Student {

    String name;
    int roll;

 // Non-parameterized constructor
    Student() {
      System.out.println("constructor is called..");
    }
    // parameterized constructor
    Student(String name) {
        this.name = name;
    }
}

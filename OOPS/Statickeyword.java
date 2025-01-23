public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "MJRP"; // Assigning a value to the static variable

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Will print "MJRP" since it's static

        Student s3 = new Student();
        s3.schoolName = "IDEAL"; // Changes the value of the static variable
        System.out.println(s3.schoolName); // Will print "IDEAL"
    }
}

class Student {
    String name;
    int roll;
    static String schoolName; // Static variable, shared by all instances

    void setName(String name) {
        this.name = name;
    }

    String getName() { // Changed return type to String
        return this.name;
    }
}

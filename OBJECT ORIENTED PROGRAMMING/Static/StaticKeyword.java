

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schlName="Ideal";

           Student s2=new Student();
           System.out.println(s2.schlName);
           s2.schlName="MJRP";
             System.out.println(s1.schlName);
             Student.eat();

    }
}
class Student{
    String name;
    int roll;
    static  String schlName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    static void  eat(){
        System.out.println("eating time");
    }
}


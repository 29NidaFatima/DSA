public class OOPspracticeQues {

    public static void main(String[] args) {
        // Q1
        Student s = new Student();
        s.name = "Nida";
        System.out.println(s.name);
        // Q5
        Vehicle obj1= new Car();
        obj1.print();
        Vehicle obj2= new Vehicle();
        obj2.print();
        // Q6
        Vehicle obj1= new Car();
        obj1.print1();
        Vehicle obj2= new Vehicle();
        obj2.print();
        // Q8
       System.out.println(Book.count);
       Book b1=new Book(150);
       Book b2= new Book(250);
       System.out.println(Book.count);
        


    }
}

// Q1
class Student {
    String name;
    int marks;

}
// Q5
class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class(Car)");
    }
}
// Q6
class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(Car)");
    }
}
 Q8
 class Book{
    int price;
    static int count;

    public Book(int price){
        this.price=price;
        count++;
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        Bird bird=new  Bird();
        bird.eat();
    }
}
//Base class
class Animal{
    //Properties
 String color;
 //Methods
 void eat(){
System.out.println("eats");
 }
 void breathe(){
    System.out.println("breathe");
 }
}
// [All derived class(Mammal,Fish,Bird) inherits the properties from single parent class name ( Animal)]
// Derived class(Mammal class have all properties of Animal class)
class Mammal extends  Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
// Derived class(Fish class have all properties of Animal class)
class Fish extends  Animal{

    void swim(){
        System.out.println("swims");
    }
}
// Derived class(Bird class have all properties of Animal class)
class Bird extends  Animal{

    void fly(){
        System.out.println("fly");
    }
}